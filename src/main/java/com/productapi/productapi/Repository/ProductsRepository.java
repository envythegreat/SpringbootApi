package com.productapi.productapi.Repository;

import com.productapi.productapi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface ProductsRepository extends MongoRepository<Product, String> {
}


@RestController
class ProductRestController {
    @Autowired
    private ProductsRepository productRepo;

    @PostMapping(path = "/saveproducts")
    public List<Product> save(@RequestBody List<Product> products){
      return productRepo.saveAll(products);
    };
}