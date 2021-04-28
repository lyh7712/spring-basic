package lyh7712.springbasic.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService service = new MemberServiceImpl();

    @Test
    void 회원가입_테스트() {
        Member member = new Member(1L, "MemberA", Grade.BASIC);
        service.join(member);

        Member findMember = service.findMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);
    }

}