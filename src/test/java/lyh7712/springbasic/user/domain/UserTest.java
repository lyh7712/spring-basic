package lyh7712.springbasic.user.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

    User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @Test
    public void
    upgradeLevel() {
        Level[] levels = Level.values();
        for(Level level : levels) {
            if(level.nextLevel() == null) continue;
            user.setLevel(level);
            user.upgradeLevel();
            Assertions.assertThat(user.getLevel()).isEqualTo(level.nextLevel());
        }
    }

}