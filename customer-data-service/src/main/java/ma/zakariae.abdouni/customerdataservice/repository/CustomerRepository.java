package ma.zakariae.abdouni.customerdataservice.repository;

import ma.zakariae.abdouni.customerdataservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
