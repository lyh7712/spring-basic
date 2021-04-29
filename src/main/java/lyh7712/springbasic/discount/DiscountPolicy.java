package lyh7712.springbasic.discount;

import lyh7712.springbasic.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
