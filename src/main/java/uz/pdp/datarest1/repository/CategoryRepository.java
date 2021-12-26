package uz.pdp.datarest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarest1.entity.Category;
import uz.pdp.datarest1.projections.WithIdCategoryProjection;

@RepositoryRestResource(path = "category",excerptProjection = WithIdCategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
