package lyh7712.springbasic;


import lyh7712.springbasic.discount.DiscountPolicy;
import lyh7712.springbasic.discount.FixDiscountPolicy;
import lyh7712.springbasic.discount.RateDiscountPolicy;
import lyh7712.springbasic.member.MemberMemoryRepository;
import lyh7712.springbasic.member.MemberRepository;
import lyh7712.springbasic.member.MemberService;
import lyh7712.springbasic.member.MemberServiceImpl;
import lyh7712.springbasic.order.OrderService;
import lyh7712.springbasic.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // 객체 생성과 동시에 구현체 주입
    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemberMemoryRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }

}
