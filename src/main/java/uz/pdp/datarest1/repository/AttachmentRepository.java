package uz.pdp.datarest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.datarest1.entity.Attachment;
import uz.pdp.datarest1.projections.WithIdAttachment;

import java.util.List;

@RepositoryRestResource(path = "attachment",excerptProjection = WithIdAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {

    @RestResource(rel = "byContentType")
    List<Attachment> findAllByContentType(String contentType);
}
