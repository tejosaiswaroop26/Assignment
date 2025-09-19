package com.store.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ProductsApplication {

	public static void main(String[] args) {

        ApplicationContext ap = SpringApplication.run(ProductsApplication.class, args);


        ProductService productService = ap.getBean(ProductService.class);
        productService.addProduct(new Products(0, "Brush", 30.0));
        productService.addProduct(new Products(1, "ToothPaste", 50.0));
        productService.addProduct(new Products(2, "Soap", 25.0));


        System.out.println(productService.getProductsByName());
        System.out.println(productService.getProductsByPrice());

	}

}
