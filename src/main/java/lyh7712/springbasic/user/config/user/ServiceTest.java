package lyh7712.springbasic.user.config.user;

import org.springframework.stereotype.Service;

@Service
public class ServiceTest {

    RepositoryTest repositoryTest;

    public ServiceTest(RepositoryTest repositoryTest) {
        this.repositoryTest = repositoryTest;
    }

    public void register(User user) {
        repositoryTest.save(user);
    }
}
