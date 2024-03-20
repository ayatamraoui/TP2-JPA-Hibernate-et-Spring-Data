package com.example.ormlab1;

import com.example.ormlab1.dao.entitie.Product;
import com.example.ormlab1.dao.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ormlab1Application implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository ;
    public static void main(String[] args) {
        SpringApplication.run(Ormlab1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        Product product1 = new Product();
        product1.setName("Produit 1");
        product1.setPrice(10.0);
        product1.setDescription("prod");
        productRepository.save(product1);

        Product product2 = new Product();
        product2.setName("Produit 2");
        product2.setPrice(20.0);
        product2.setDescription("produiittt122");
        productRepository.save(product2);


        System.out.println(productRepository.findById(1L));
        product1.setName("P1");
        productRepository.save(product1);
        System.out.println(product1);

        product2.setPrice(190.0);
        productRepository.save(product2);
        System.out.println(product2);

        productRepository.delete(product2);





    }
}
