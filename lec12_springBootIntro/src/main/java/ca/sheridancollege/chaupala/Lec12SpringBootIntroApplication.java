package ca.sheridancollege.chaupala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ca.sheridancollege.*")
public class Lec12SpringBootIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lec12SpringBootIntroApplication.class, args);
	}

}
