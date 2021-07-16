package lyh7712.springbasic.user.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lyh7712.springbasic.user.domain.User;


public class UserRepository {

    private static final Map<Long, User> store = new HashMap<>();

    public void save(User user) {
        store.put(user.getId(), user);
    }

    public void updateUser(User user) {
        User findUser = store.get(user.getId());
        if (findUser.getId() == user.getId()) {
            store.put(findUser.getId(), new User(user.getId(), user.getName(), user.getPassword(), user.getLevel(), user.getLogin(), user.getRecommend()));
        }
    }

    public User getUser(Long id) {
        return store.get(id);
    }

    public List<User> getAll() {
        return new ArrayList<>(store.values());
    }
}
