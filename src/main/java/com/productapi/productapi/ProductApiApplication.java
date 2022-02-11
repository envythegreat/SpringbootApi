package com.productapi.productapi;

import com.productapi.productapi.Repository.ProductRepository;
import com.productapi.productapi.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class ProductApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApiApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(ProductRepository repository){
//        return args -> {
//            Product product = new Product(
//                    "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
//                    109.95,
//                    "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
//                    "men's clothing",
//                    "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
//                    3.5
//            );
//            repository.insert(product);
//        };
//    }

}
