package com.example.yunghan.repository;

import com.example.yunghan.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    void save(Member member);

    Optional<Member> findById(Long id);

    Optional<Member> findByName(String name);
}
