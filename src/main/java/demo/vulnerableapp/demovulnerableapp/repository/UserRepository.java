package demo.vulnerableapp.demovulnerableapp.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import demo.vulnerableapp.demovulnerableapp.model.User;

public interface UserRepository extends MongoRepository<User, String>{

    public User findByFirstName(String firstName);
    public List<User> findByLastName(String lastName);
    public User save(User user);
    
}
