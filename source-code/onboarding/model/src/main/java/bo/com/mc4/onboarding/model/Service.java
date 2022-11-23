package bo.com.mc4.onboarding.model;

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
@Table(name = "SERVICE")
@Where(clause = "DELETED=false")
public class Service extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    @Column(name = "type", nullable = false, length = 50)
    private String type;

    @Column(name = "REQUEST_TIMEOUT", nullable = false)
    private int requestTimeout;

    @Column(name = "CONNECTION_TIMEOUT", nullable = false)
    private int connectionTimeout;

    @Column(name = "URL", nullable = false, length = 200)
    private String url;

    @Column(name = "API", nullable = false, length = 100)
    private String api;



}
