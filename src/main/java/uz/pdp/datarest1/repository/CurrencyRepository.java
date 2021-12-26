package uz.pdp.datarest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarest1.entity.Currency;
import uz.pdp.datarest1.projections.WithIdCurrencyProjection;

@RepositoryRestResource(path = "currency",excerptProjection = WithIdCurrencyProjection.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
}
