package demo.vulnerableapp.demovulnerableapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import demo.vulnerableapp.demovulnerableapp.model.User;
import demo.vulnerableapp.demovulnerableapp.repository.UserRepository;

public class DemoLoader implements CommandLineRunner{

    private final UserRepository repository;

    @Autowired
    public DemoLoader(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String...strings) throws Exception {
        this.repository.save(new User("FirstName","LastName","myemail@email.com"));
    }
    
}
