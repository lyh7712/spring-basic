package lyh7712.springbasic.test;

import static org.junit.jupiter.api.Assertions.*;

import lyh7712.springbasic.user.test.Dollar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    @DisplayName("곱셈 예제")
    public void testMultiple() {
        Dollar dollar = new Dollar(5);
        assertTrue(new Dollar(10).equals(dollar.times(2)));
        assertTrue(new Dollar(15).equals(dollar.times(3)));
    }

}
