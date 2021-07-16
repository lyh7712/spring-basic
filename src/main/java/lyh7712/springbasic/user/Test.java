package lyh7712.springbasic.user;

import java.util.List;
import lyh7712.springbasic.user.domain.Car;
import lyh7712.springbasic.user.domain.Level;
import lyh7712.springbasic.user.domain.NutritionFacts;
import lyh7712.springbasic.user.domain.Person;
import lyh7712.springbasic.user.domain.User;
import lyh7712.springbasic.user.repository.UserRepository;
import lyh7712.springbasic.user.service.UserService;

public class Test {

    public static void main(String[] args) {

        UserService service = new UserService(new UserRepository());

        User user1 = new User(1L, "lee", "1234", Level.BASIC, 49, 0);
        User user2 = new User(2L, "sim", "1234", Level.BASIC, 55, 0);
        User user3 = new User(3L, "kim", "1234", Level.SILVER, 60, 40);
        User user4 = new User(4L, "han", "1234", Level.SILVER, 60, 30);
        User user5 = new User(5L, "dong", "1234", Level.GOLD, 100, 100);

        service.register(user1);
        service.register(user2);
        service.register(user3);
        service.register(user4);
        service.register(user5);

//        checkSameUser(user1, user2);


        List<User> users = service.findAll();

        System.out.println(user1.getLevel().equals(Level.BASIC));
        System.out.println(user2.getLevel().equals(Level.SILVER));
        System.out.println(user3.getLevel().equals(Level.SILVER));
        System.out.println(user4.getLevel().equals(Level.GOLD));
        System.out.println(user5.getLevel().equals(Level.GOLD));


        NutritionFacts nutritionFacts = new NutritionFacts
                .Builder(200, 40)
                .calories(100)
                .sodium(35)
                .build();

        System.out.println(nutritionFacts);

        System.out.println(Person.getInstance());

    }

    public static void checkSameUser(User user1, User user2) {
        System.out.println(user1.getId().equals(user2.getId()));
        System.out.println(user1.getName().equals(user2.getName()));
        System.out.println(user1.getPassword().equals(user2.getPassword()));
        System.out.println(user1.getLevel().equals(user2.getLevel()));
        System.out.println(user1.getLogin() == (user2.getLogin()));
        System.out.println(user1.getRecommend() == (user2.getRecommend()));
    }


}
