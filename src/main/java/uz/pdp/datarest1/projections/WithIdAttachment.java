package uz.pdp.datarest1.projections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest1.entity.Attachment;

import javax.persistence.Column;

@Projection(types = {Attachment.class})
public interface WithIdAttachment {
    @Value("#{target.id}")
    Integer getId();
    String getName();
    Long getSize();
    String getContentType();
}
