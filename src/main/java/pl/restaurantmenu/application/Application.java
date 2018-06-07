package pl.restaurantmenu.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "pl.restaurantmenu")
@EntityScan(basePackages = {"pl.restaurantmenu.entity"})
@EnableJpaRepositories(basePackages = "pl.restaurantmenu.repository")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
