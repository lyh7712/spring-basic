package lyh7712.springbasic.order;

import lyh7712.springbasic.member.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService service = new OrderServiceImpl();

    @Test
    void 오더_생성() {
        Member member = new Member(1L, "MemberA", Grade.VIP);
        memberService.join(member);

        Order order = service.createOrder(member.getId(), "ItemA", 10000);
        Assertions.assertThat(order.getDiscount()).isEqualTo(1000); // 비교
    }
}