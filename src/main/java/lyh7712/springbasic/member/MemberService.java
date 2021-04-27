package lyh7712.springbasic.member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long id);
}
