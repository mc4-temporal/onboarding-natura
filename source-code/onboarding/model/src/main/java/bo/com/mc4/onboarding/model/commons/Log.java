package bo.com.mc4.onboarding.model.commons;

import bo.com.mc4.onboarding.model.commons.enums.LogType;
import bo.com.mc4.onboarding.model.commons.enums.ProcessType;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "LOG")
public class Log extends AuditableEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PROCESS_TYPE", nullable = false)
    @Enumerated(EnumType.STRING)
    private ProcessType processType;

    @Column(name = "LOG_TYPE", nullable = false)
    @Enumerated(EnumType.STRING)
    private LogType logType;

    @Lob
    @Type(type = "text")
    @Column(name = "LOG", nullable = false)
    private String log;

    @Column(name = "PAGINA")
    private String pagina;
}
