package lyh7712.springbasic.user.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {


    @PostMapping("/login")
    public void login(HttpServletRequest httpServletRequest) {

        User user1 = new User(1L, "mmj2rv9", "password");
        User user2 = new User(2L, "lee", "password");
        HttpSession session = httpServletRequest.getSession(false);
        System.out.println(session);
        session.setAttribute("user", user1);

        System.out.println(session.getAttribute("user"));
    }
}
