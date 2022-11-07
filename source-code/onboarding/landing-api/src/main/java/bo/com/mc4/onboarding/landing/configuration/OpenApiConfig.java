package bo.com.mc4.onboarding.landing.configuration;

/**
 * Created by :MC4
 * Author :Ricardo Laredo
 * Email :rlaredo@mc4.com.bo
 * Date :2020-09-07
 * Project onboarding
 * Package :bo.com.mc4.onboarding.controller
 * Copyright :MC4
 */

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "APIs Onboarding Backoffice",
                version = "v1",
                description = "Esta aplicación provee APIs REST para la aplicación web de onboarding Natura",
                contact = @Contact(
                        name = "Natura",
                        email = "mail@natura.net"
                )
        ),
        servers = {
                @Server(
                        url = "http://localhost:8081",
                        description = " Servidor de desarrollo"
                )
        }
)
@SecurityScheme(
        name = "bearerToken",
        type = SecuritySchemeType.HTTP,
        in = SecuritySchemeIn.HEADER,
        scheme = "bearer",
        bearerFormat = "jwt"
)
public class OpenApiConfig {
}
