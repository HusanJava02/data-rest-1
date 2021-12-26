package uz.pdp.datarest1.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest1.entity.Category;

@Projection(types = Category.class)
public interface WithIdCategoryProjection {
    Integer getId();
    String getName();
    Boolean getActive();
    Category getParentCategory();
}
