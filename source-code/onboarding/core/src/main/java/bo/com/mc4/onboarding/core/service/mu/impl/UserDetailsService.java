package bo.com.mc4.onboarding.core.service.mu.impl;

import bo.com.mc4.onboarding.model.auth.AuthUser;
import bo.com.mc4.onboarding.repository.auth.AuthUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final AuthUserRepository usuarioRepository;

    public UserDetailsService(AuthUserRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AuthUser authUser =  this.usuarioRepository.obtenerUsuarioParaAutentificacion(username.toLowerCase())
                .orElseThrow(() -> new UsernameNotFoundException("No existe el usuario"));

        return new User(
                authUser.getUsername(),
                authUser.getPassword(),
                authUser.isEnabled(),
                true,
                authUser.isAccountNonExpired(),
                true,
                authUser.getAuthorities()
        );
    }
    
}
