package lyh7712.springbasic.user.config.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import java.net.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@RestController
public class ControllerTest {

    ServiceTest serviceTest;

    public ControllerTest(ServiceTest serviceTest) {
        this.serviceTest = serviceTest;
    }

    @PostMapping("/register")
    public void register(@RequestBody User user) {
        serviceTest.register(user);
    }

    @PostMapping("/login")
    public void login(HttpServletRequest request, HttpHeaders httpHeaders, @RequestBody User user) {

        HttpSession session2 = request.getSession(true);

        System.out.println("sessionId" + session2.getId());

        session2.setAttribute("USER", user);

        System.out.println("getAttribute = " + session2.getAttribute("USER"));

        String sessionId = request.getHeader(AUTHORIZATION);

        System.out.println("sessionId = " + sessionId);

    }
}
