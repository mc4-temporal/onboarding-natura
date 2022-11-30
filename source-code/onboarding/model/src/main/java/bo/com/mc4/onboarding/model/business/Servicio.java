package bo.com.mc4.onboarding.model.business;

import bo.com.mc4.onboarding.model.business.enums.TipoServicio;
import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by    : msaavedra
 * Date          : 22/11/22
 * Project       : onboarding
 * Package       : bo.com.mc4.onboarding.model
 **/
@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SERVICIO")
@Where(clause = "DELETED=false")
public class Servicio extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name ="NOMBRE", nullable = false, length = 50)
    private String nombre;

    @Column(name = "TIPO", nullable = false, length = 50)
    @Enumerated(EnumType.STRING)
    private TipoServicio tipo;

    @Column(name = "REQUEST_TIMEOUT", nullable = false)
    private int requestTimeout;

    @Column(name = "CONNECTION_TIMEOUT", nullable = false)
    private int connectionTimeout;

    @Column(name = "URL", nullable = false, length = 200)
    private String url;

    @Column(name = "API", nullable = false, length = 100)
    private String api;

    @Column(name = "CLIENT_ID")
    private String clientId;

    @Column(name = "CLIENT_SECRET")
    private String clientSecret;

    @Column(name = "GRANT_TYPE")
    private String grantType;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;




}
