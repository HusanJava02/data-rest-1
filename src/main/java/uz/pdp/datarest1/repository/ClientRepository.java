package uz.pdp.datarest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarest1.entity.Client;
import uz.pdp.datarest1.projections.WithIDClientProjection;

@RepositoryRestResource(path = "client",excerptProjection = WithIDClientProjection.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {

}
