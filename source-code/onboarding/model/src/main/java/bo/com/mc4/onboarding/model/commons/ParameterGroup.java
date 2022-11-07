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
@Table(name = "PARAMETER_GROUP")
public class ParameterGroup extends AuditableEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "GROUP_NAME", nullable = false, length = 100)
    private String groupName;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;
}
