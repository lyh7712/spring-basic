package lyh7712.springbasic.user.serialize;

import java.io.Serializable;

public class Member implements Serializable {

    private String email;
    private String name;
    private int age;

    public Member(String email, String name, int age) {
        this.email = email;
        this.name = name;
        this.age = age;
    }


}
