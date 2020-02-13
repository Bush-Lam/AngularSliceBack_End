package dev.slice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("dev.slice") // scan all packages to make spring boot
@EnableJpaRepositories("dev.slice.repositories") // where are all the repositories located
@EntityScan("dev.slice.entities") // where are all the entities located
public class AngularSliceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularSliceApplication.class, args);
	}

}
