package bo.com.mc4.onboarding.backoffice.configuration;

import bo.com.mc4.onboarding.model.auth.AuthUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.Serializable;
import java.util.Optional;

/**
 * Created by    : fmontero
 * Date          : 14-12-18
 * Project       : unilink
 * Package       : bo.com.mc4.onboarding.configuration
 **/
@Configuration
@EnableJpaAuditing
public class InjectConfiguration implements WebMvcConfigurer, Serializable{
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//        return PasswordEncoderFactories.createDelegatingPasswordEncoder()
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    public AuditorAware<String> auditorAware() {
        return () -> {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            if (authentication == null || !authentication.isAuthenticated()) {
                return Optional.of("ADMIN");
            }

            try {
                Optional<AuthUser> principal = Optional.of((AuthUser) authentication.getPrincipal());
                return Optional.ofNullable(principal.get().getUsername());
            }catch (Exception e){
                return Optional.of("ADMIN");
            }
        };


    }

    @Bean
    public AuthUser auditorAwareUser() {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            if (authentication == null || !authentication.isAuthenticated()) {
                return null;
            }
            Optional<AuthUser> principal = Optional.of((AuthUser) authentication.getPrincipal());
            return principal.get();
    }
}
