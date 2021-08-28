package lyh7712.springbasic.user.test;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map map = new HashMap();

        Calculator calculator = new Calculator();

        calculator.setNumber(10, 20);
        calculator.plus();
    }
}
