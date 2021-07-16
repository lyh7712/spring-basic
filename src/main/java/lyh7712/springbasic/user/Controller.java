package lyh7712.springbasic.user;

import lyh7712.springbasic.user.domain.Contract;
import lyh7712.springbasic.user.repository.ContractRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    ContractRepository repository;

    public Controller(ContractRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/contracts")
    public void register(Contract contract) {
        repository.save(contract);
    }

    @GetMapping("/contracts")
    public void getAllContract() {
        System.out.println(repository.findAll());
    }
}

