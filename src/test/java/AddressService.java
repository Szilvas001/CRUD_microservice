// AddressService.java



import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class AddressService {

    public Address getAddress() {
        UUID id = UUID.randomUUID();
        String address = "123 Main Street";
        return new Address(id, address);
    }
}
