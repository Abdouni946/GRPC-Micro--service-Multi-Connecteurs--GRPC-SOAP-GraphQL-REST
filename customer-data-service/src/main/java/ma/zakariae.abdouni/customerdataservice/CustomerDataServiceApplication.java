package ma.zakariae.abdouni.customerdataservice;

import ma.zakariae.abdouni.customerdataservice.entities.Customer;
import ma.zakariae.abdouni.customerdataservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerDataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerDataServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("zakariae").email("zakariae@gmail.com").build());
            customerRepository.save(Customer.builder().name("ismaeil").email("ismaeil@gmail.com").build());
            customerRepository.save(Customer.builder().name("issam").email("issam@gmail.com").build());
        };
    }
}
