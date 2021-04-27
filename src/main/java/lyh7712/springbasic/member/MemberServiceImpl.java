package lyh7712.springbasic.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository repository = new MemberMemoryRepository();

    @Override
    public void join(Member member) {
        repository.save(member);
    }

    @Override
    public Member findMember(Long id) {
        return repository.findById(id);
    }
}
