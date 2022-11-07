package bo.com.mc4.onboarding.model.commons;

import bo.com.mc4.onboarding.model.commons.enums.ParameterType;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PARAMETER")
public class Parameter extends AuditableEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CODE", nullable = false)
    private String code;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "STRING_VALUE", length = 1024)
    private String stringValue;

    @Column(name = "BOOL_VALUE")
    private Boolean boolValue;

    @Column(name = "NUMBER_VALUE")
    private BigDecimal numberValue;

    @Column(name = "DATE_VALUE")
    private Date dateValue;

    @Column(name = "PARAMETER_TYPE", nullable = false)
    @Enumerated(EnumType.STRING)
    private ParameterType parameterType;

    @Column(name = "ENCODE")
    private boolean encode;

    @Lob
    @Type(type = "text")
    @Column(name = "LOB_VALUE")
    private String lobValue;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_PARAMETER_GROUP", nullable = false)
    private ParameterGroup idParameterGroup;
}
