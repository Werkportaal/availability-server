package Werkportaal.availabilityserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com"})
public class AvailabilityServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvailabilityServerApplication.class, args);
	}

}
