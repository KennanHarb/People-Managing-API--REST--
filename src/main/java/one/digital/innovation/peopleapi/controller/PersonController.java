package one.digital.innovation.peopleapi.controller;

import one.digital.innovation.peopleapi.dto.MessageResponseDTO;
import one.digital.innovation.peopleapi.dto.request.PersonDTO;
import one.digital.innovation.peopleapi.entity.Person;
import one.digital.innovation.peopleapi.repository.PersonRepository;
import one.digital.innovation.peopleapi.service.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonServices personServices;

    @Autowired
    public PersonController(PersonServices personServices) {
        this.personServices = personServices;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){
        return personServices.createPerson(personDTO);
    }
}
