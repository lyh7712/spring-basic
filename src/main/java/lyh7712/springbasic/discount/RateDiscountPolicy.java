package lyh7712.springbasic.discount;

import lyh7712.springbasic.member.Grade;
import lyh7712.springbasic.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int rateDiscount = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * 10 / 100;
        } else {
            return 0;
        }
    }
}
