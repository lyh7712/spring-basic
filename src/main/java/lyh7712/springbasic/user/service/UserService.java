package lyh7712.springbasic.user.service;

import java.util.List;
import lyh7712.springbasic.user.domain.Level;
import lyh7712.springbasic.user.domain.User;
import lyh7712.springbasic.user.repository.UserRepository;


public class UserService {

    UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void register(User user) {
        if(user.getLevel() == null) {
            user.setLevel(Level.BASIC);
            repository.save(user);
        }
    }

    public List<User> findAll() {
        return repository.getAll();
    }


    public void upgradeLevels(User user) {
        user.upgradeLevel();
        canUpgradeLevel(user);
        repository.updateUser(user);
    }

    private boolean canUpgradeLevel(User user) {
        Level currentLevel = user.getLevel();
        switch (currentLevel){
            case BASIC: return (user.getLogin() >= 50);
            case SILVER: return (user.getRecommend() >= 30);
            case GOLD: return false;
            default: throw new IllegalArgumentException("Unknown Level" + currentLevel);
        }
    }
}
