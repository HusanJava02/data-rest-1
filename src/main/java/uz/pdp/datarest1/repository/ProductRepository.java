package uz.pdp.datarest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.datarest1.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
