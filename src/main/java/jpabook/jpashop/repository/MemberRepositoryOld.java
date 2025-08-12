package jpabook.jpashop.repository;
import jpabook.jpashop.domain.Member;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryOld {

    private final EntityManager em;

    // 회원 저장
    public void save(Member member) {
        em.persist(member);
    }

    // 회원 단건 조회
    public Member findOne(Long id) {
        return em.find(Member.class, id);
    }

    // 전체 회원 조회
    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }

    // 이름으로 회원 검색 (중복 허용 시 다건 반환)
    public List<Member> findByName(String name) {
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
    }

    /**
     * 회원 수정
     */
    @Transactional
    public void update(Long id, String name) {
        Member member = findOne(id);
        member.setName(name);
    }
}
