package one.digital.innovation.peopleapi.repository;

import one.digital.innovation.peopleapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
