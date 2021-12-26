package uz.pdp.datarest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.datarest1.entity.User;


public interface UserRepository extends JpaRepository<User,Integer> {

}
