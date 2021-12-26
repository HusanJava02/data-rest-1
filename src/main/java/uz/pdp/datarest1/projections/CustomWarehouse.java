package uz.pdp.datarest1.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest1.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Integer getId();
    String getName();
    Boolean getActive();
}
