package ca.sheridancollege.chaupala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ca.sheridancollege.*")
public class Ex12IntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex12IntroApplication.class, args);
	}

}
