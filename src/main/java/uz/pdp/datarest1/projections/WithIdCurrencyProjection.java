package uz.pdp.datarest1.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarest1.entity.Currency;

@Projection(types = Currency.class)
public interface WithIdCurrencyProjection {
    Integer getId();
    String getName();
    Boolean getActive();
}
