package address;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @GetMapping("/getAddress")
    public Address getAddress() {
        UUID id = UUID.randomUUID();
        String address = "123 Main Street";
        return new Address(id, address);
    }
}

