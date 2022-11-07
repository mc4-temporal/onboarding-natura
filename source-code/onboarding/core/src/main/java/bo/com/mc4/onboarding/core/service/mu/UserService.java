package bo.com.mc4.onboarding.core.service.mu;

import bo.com.mc4.onboarding.model.auth.AuthUser;
import bo.com.mc4.onboarding.model.auth.dto.RecoveryPasswordDto;
import bo.com.mc4.onboarding.model.auth.dto.UserDto;
import bo.com.mc4.onboarding.model.auth.dto.UserPassword;
import bo.com.mc4.onboarding.model.auth.dto.v1.ResourceDto;
import bo.com.mc4.onboarding.model.auth.enums.UserStatus;
import bo.com.mc4.onboarding.model.commons.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    AuthUser findUserByUsername(String username);

    String changePassword(AuthUser authAuthUser, UserPassword password);

    String recuperarPassword(RecoveryPasswordDto request);

    List<ResourceDto> userResourceList(String username);

    Page<AuthUser> getUserList(String filter, Pageable pageable);

    AuthUser createUser(UserDto userDto);

    AuthUser updateUser(UserDto userDto, Long userId);

    void deleteUser(Long userId);

    AuthUser updateUserStatus(Long userId, UserStatus userStatus);

    UserDto userInfo(String username);

    Page<Log> logSesiones(String username, Pageable pageable);
}

