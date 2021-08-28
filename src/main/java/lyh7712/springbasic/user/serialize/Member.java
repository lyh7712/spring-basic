package lyh7712.springbasic.user.serialize;

import lyh7712.springbasic.user.test.Money;

public class Member extends Money {

    private String email;
    private String name;
    private int age;

    public Member() {
    }

    public Member(String email, String name, int age) {
        this.email = email;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Member member = new Member();
        System.out.println(member.number);
    }


    public void publicMethod() {

    }
    private void privateMethod() {

    }
    protected void protectedMethod() {

    }
    void defaultMethod() {

    }

}
