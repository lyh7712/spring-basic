package lyh7712.springbasic.discount;

import lyh7712.springbasic.member.Grade;
import lyh7712.springbasic.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountPrice = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountPrice;
        } else {
            return 0;
        }
    }
}
