package uz.pdp.datarest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.datarest1.entity.Measurement;

public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {
    public boolean existsByName(String name);
}
