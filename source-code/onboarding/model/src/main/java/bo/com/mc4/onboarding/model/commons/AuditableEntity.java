package bo.com.mc4.onboarding.model.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public abstract class AuditableEntity implements Serializable,Cloneable {

    @CreatedDate
    protected Date createdDate;

    @LastModifiedDate
    protected Date modifiedDate;

    @CreatedBy
    protected String createdBy;

    @LastModifiedBy
    protected String modifiedBy;

    @Version
    protected  Long version;

    protected boolean deleted = false;

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }


}
