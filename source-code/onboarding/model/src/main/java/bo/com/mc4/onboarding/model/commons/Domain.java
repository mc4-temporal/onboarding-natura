package bo.com.mc4.onboarding.model.commons;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DOMAIN")
public class Domain extends AuditableEntity implements Serializable {
    @Id
    @Column(name = "ID", length = 200)
    private String id;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;
}
