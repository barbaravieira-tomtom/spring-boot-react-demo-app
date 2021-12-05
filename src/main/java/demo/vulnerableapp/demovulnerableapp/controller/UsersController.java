package demo.vulnerableapp.demovulnerableapp.controller;

import java.net.URISyntaxException;
import java.util.Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.vulnerableapp.demovulnerableapp.model.User;
import demo.vulnerableapp.demovulnerableapp.repository.UserRepository;


//@CrossOrigin(origins = {"http://localhost:3000", "http://0.0.0.0:9090"})
@RequestMapping("/api")
@RestController
public class UsersController {

    private UserRepository userRepository;
    private static final Logger logger = LogManager.getLogger();
    
    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    Collection<User> contacts() {   
        logger.info("Retrieving the list of all the users...");
        return (Collection<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    ResponseEntity<User> createContact(@Validated @RequestBody User contact) throws URISyntaxException {
        User result = userRepository.save(contact);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/users")
    ResponseEntity<String> deleteContact(@Validated @RequestBody String firstName) throws URISyntaxException {
        User user = userRepository.findByFirstName(firstName);
        userRepository.delete(user);
        return ResponseEntity.ok().body("Ok");
    }
}
