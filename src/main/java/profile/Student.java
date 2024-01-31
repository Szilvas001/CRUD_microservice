package profile;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String email;
}



