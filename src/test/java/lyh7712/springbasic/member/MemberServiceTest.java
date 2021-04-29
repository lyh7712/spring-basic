package lyh7712.springbasic.member;

import lyh7712.springbasic.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MemberServiceTest {

    MemberService service;

    @BeforeEach
    void beforeEach() {
        AppConfig appConfig = new AppConfig();
        service = appConfig.memberService();
    }

    @Test
    void 회원가입_테스트() {
        Member member = new Member(1L, "MemberA", Grade.BASIC);
        service.join(member);

        Member findMember = service.findMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);
    }

}