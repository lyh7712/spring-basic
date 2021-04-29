package lyh7712.springbasic.discount;

import lyh7712.springbasic.member.Grade;
import lyh7712.springbasic.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class RateDiscountPolicyTest {

    private DiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10%를 할인을 적용한다.")
    void vip_o() {
        Member member = new Member(1L, "memberA", Grade.VIP);

        int discountPrice = discountPolicy.discount(member, 10000);

        Assertions.assertThat(discountPrice).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 10% 할인은 적용되지 않는다.")
    void vip_x() {
        Member member2 = new Member(2L, "memberB", Grade.BASIC);

        int discountPrice = discountPolicy.discount(member2, 10000);

        Assertions.assertThat(discountPrice).isEqualTo(0);
    }

}