package bo.com.mc4.onboarding.model.commons.dto;

import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractAuditableDto implements Serializable, Cloneable {
    protected Date createdDate;
    protected Date modifiedDate;
    protected String createdBy;
    protected String modifiedBy;
    protected Long version;
    protected boolean deleted;

    public AbstractAuditableDto(AuditableEntity entity) {
        this.createdDate = entity.getCreatedDate();
        this.modifiedDate = entity.getModifiedDate();
        this.createdBy = entity.getCreatedBy();
        this.modifiedBy = entity.getModifiedBy();
        this.version = entity.getVersion();
        this.deleted = entity.isDeleted();
    }
}
