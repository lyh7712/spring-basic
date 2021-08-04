package lyh7712.springbasic;

import lyh7712.springbasic.user.config.SwaggerWebMvc;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(SwaggerWebMvc.class)
@SpringBootTest
class SpringBasicApplicationTests {

	@Test
	void contextLoads() {
	}

}
