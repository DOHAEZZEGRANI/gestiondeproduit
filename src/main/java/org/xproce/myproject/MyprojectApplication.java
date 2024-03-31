package org.xproce.myproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xproce.myproject.dao.entities.Product;
import org.xproce.myproject.dao.repositories.ProductRepository;
import org.xproce.myproject.service.ProductManager;

import java.util.List;

@SpringBootApplication
public class MyprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyprojectApplication.class, args);
	}
	//@Bean
	public CommandLineRunner startDAO(ProductRepository productRepository) {
		return args -> {
			Product product = new Product();
			product.setName("PC");
			product.setDescription("msi i9 2to ssd");
			product.setPrice(2500.0);

			Product product1 = new Product();
			product1.setName("Ecran");
			product1.setDescription("Hp 165 hz refresh ... ");
			product1.setPrice(500.0);
			productRepository.saveAll(List.of(product1, product));
		};
	}

	//@Bean
	public CommandLineRunner startService(ProductManager productManager) {
		return args -> {
			Product product = new Product();
			product.setName("PC");
			product.setDescription("msi i9 2to ssd");
			product.setPrice(2500.0);


			Product product1 = new Product();
			product1.setName("Ecran");
			product1.setDescription("Hp 165 hz refresh ... ");
			product1.setPrice(500.0);
			productManager.addProduct(product);
			productManager.addProduct(product1);
		};
	}

}
