package one.digital.innovation.peopleapi.service;

import one.digital.innovation.peopleapi.dto.MessageResponseDTO;
import one.digital.innovation.peopleapi.dto.request.PersonDTO;
import one.digital.innovation.peopleapi.entity.Person;
import one.digital.innovation.peopleapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonServices {

    private PersonRepository personRepository;

    @Autowired
    public PersonServices(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO){
        Person personToSave = Person.builder()

                .build();
        Person savedPerson = personRepository.save(personDTO);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
