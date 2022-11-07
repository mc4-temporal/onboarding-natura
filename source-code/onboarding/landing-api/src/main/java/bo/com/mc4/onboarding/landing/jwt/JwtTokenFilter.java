package bo.com.mc4.onboarding.landing.jwt;

import bo.com.mc4.onboarding.core.config.JwtTokenProvider;
import bo.com.mc4.onboarding.core.util.exception.InvalidJwtAuthenticationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.ExpiredJwtException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

@Slf4j
public class JwtTokenFilter extends GenericFilterBean implements Serializable {

    private final JwtTokenProvider jwtTokenProvider;

    public JwtTokenFilter(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        try {
            String token = jwtTokenProvider.resolveToken((HttpServletRequest) servletRequest);
            if (token == null) {
                log.info("Request Sin Token: "+((HttpServletRequest) servletRequest).getRequestURL());
                filterChain.doFilter(servletRequest, servletResponse);
                return;
            }
            try {
                if (jwtTokenProvider.validateToken(token)) {
                    log.info("Token se valido correctamente");
                    Authentication auth = jwtTokenProvider.getAuthentication(token);
                    if (auth != null) {
                        SecurityContextHolder.getContext().setAuthentication(auth);
                        filterChain.doFilter(servletRequest, servletResponse);
                        return;
                    }
                }
            } catch (ExpiredJwtException e) {
                log.error("No se logró validar el JWT, por lo que se devuelve código 403. FORBIDDEN");
                response.setContentType(MediaType.APPLICATION_JSON.getType());
                response.getWriter().write(new ObjectMapper().writeValueAsString(HttpStatus.FORBIDDEN));
                response.setStatus(HttpStatus.FORBIDDEN.value());
                return;
            }
            log.error("No se logró validar el JWT, por lo que se devuelve código 403. FORBIDDEN");
            response.setContentType(MediaType.APPLICATION_JSON.getType());
            response.getWriter().write(new ObjectMapper().writeValueAsString(HttpStatus.FORBIDDEN));
            response.setStatus(HttpStatus.FORBIDDEN.value());
        } catch (InvalidJwtAuthenticationException e) {
            log.error("Exepción al validar el JWT",e);
            response.setContentType(MediaType.APPLICATION_JSON.getType());
            response.getWriter().write(new ObjectMapper().writeValueAsString(HttpStatus.FORBIDDEN));
            response.setStatus(HttpStatus.FORBIDDEN.value());
        } catch (Exception e) {
            log.error("Se generó una exepción genérica al validar el JWT",e);
            response.setContentType(MediaType.APPLICATION_JSON.getType());
            response.getWriter().write(new ObjectMapper().writeValueAsString(HttpStatus.INTERNAL_SERVER_ERROR));
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        }
    }


}
