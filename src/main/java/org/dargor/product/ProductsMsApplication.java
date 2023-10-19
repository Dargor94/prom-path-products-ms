package org.dargor.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableCaching
@EnableJpaRepositories
@SpringBootApplication
public class ProductsMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsMsApplication.class, args);
    }

}
