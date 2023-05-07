package org.sdia.spring_cloud_customer_service;

import org.sdia.spring_cloud_customer_service.entities.Customer;
import org.sdia.spring_cloud_customer_service.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(new Customer(null,"Ahmed","ahmed@gmail.com"));
			customerRepository.save(new Customer(null,"Samira","samira@gmail.com"));
			customerRepository.save(new Customer(null,"Yassin","yassin@gmail.com"));
			customerRepository.save(new Customer(null,"Asmae","asmae@gmail.com"));
			customerRepository.findAll().forEach(c->{
				System.out.println(c.toString());
			});
		};
	}
}
