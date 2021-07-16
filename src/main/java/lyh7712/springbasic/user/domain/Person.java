package lyh7712.springbasic.user.domain;

public class Person {

    private static Person instance;

    private Person() {}

    public static synchronized Person getInstance() {
        if (instance == null) {
            instance = new Person();
        }
        return instance;
    }

}
