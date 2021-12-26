package uz.pdp.datarest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.datarest1.entity.InputProduct;

import java.util.List;

public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
    List<InputProduct> findAllByInputId(Integer input_id);
}
