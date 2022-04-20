package com.ait.microservice.springhelloworld;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HelloService {
    @RequestMapping("/")
    public String index() {
        return "Hello World 2021....";
    }

    @RequestMapping("/abc")
    public String index2() {
        return "Hello World 2021 abc";
    }
    @RequestMapping("/sayHello/{firstName}/{lastName}")
    public String helloWorldPathParam(@PathVariable String firstName, @PathVariable String lastName) {
        return "Hello World with message: " + firstName + " " + lastName;
    }

    @RequestMapping("/sayHello")
    public String helloWorldRequestParam(@RequestParam String name, @RequestParam Integer age) {
        return "Your name is "+name+" an your age is "+age;
    }

    @RequestMapping("/someperson")
    public Person getPerson() {
        return new Person("Joe", "Bloggs", 20);
    }

    @PostMapping("/someperson")
    public String postPerson(@RequestBody Person person) {
        return person.getFirstName()+" "+person.getLastName()+" "+person.getAge();
    }

    @RequestMapping("/somepersonentity")
    public ResponseEntity<Person> getPersonEntity(){
        return new ResponseEntity<>(new Person("Joe", "Bloggs", 20), HttpStatus.ACCEPTED);
    }

    @GetMapping("/notallowed")
    public String operationForbidden() {
        throw new ForbiddenException();
    }
}
