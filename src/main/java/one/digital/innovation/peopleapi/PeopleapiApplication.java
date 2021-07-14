package one.digital.innovation.peopleapi;

import one.digital.innovation.peopleapi.entity.Person;
import one.digital.innovation.peopleapi.entity.Phone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PeopleapiApplication {

	public static void main(String[] args) {
		Person guy = new Person();
		SpringApplication.run(PeopleapiApplication.class, args);
	}

}
