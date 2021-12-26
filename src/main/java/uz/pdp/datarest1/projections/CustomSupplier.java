package uz.pdp.datarest1.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest1.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();
    String getName();
    Boolean getActive();
    String getPhoneNumber();
}
