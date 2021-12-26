package uz.pdp.datarest1.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest1.entity.Client;

@Projection(types = Client.class)
public interface WithIDClientProjection {
    Integer getId();
    String getName();
    String getPhoneNumber();
}
