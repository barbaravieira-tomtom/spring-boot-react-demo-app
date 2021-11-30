package demo.vulnerableapp.demovulnerableapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "users")
public class User {

    //This variables must be declared as private 
    // For testing purposes we're keeping them public
    @Id
    public String id;
    public String firstName;
    public String lastName;
    public String email;

    public User(){
        
    }

    public User(String firstName, String lastName, String email){

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(
            "User [id=%s, firstName='%s', lastName='%s', email='%s']", id, firstName, lastName,email);
    }
    
}
