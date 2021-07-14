package one.digital.innovation.peopleapi.controller;

import one.digital.innovation.peopleapi.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
    @GetMapping
    public String getBook(){
        Person guy = new Person();
        return "API Test!";
    }
}
