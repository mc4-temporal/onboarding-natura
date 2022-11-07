package bo.com.mc4.onboarding.model.commons;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DOMAIN_VALUE")
public class DomainValue extends AuditableEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "VALUE", length = 200, nullable = false)
    private String value;

    @JoinColumn(name = "ID_DOMAIN", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Domain idDomain;
}
