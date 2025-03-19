package com.example.yunghan.repository;

import com.example.yunghan.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

//    @Test
//    public void save() {
//        Member member = new Member();
//        member.setName("spring");
//        repository.save(member);
//
//        Member result = repository.findById(member.getId()).get();
//        assertThat(member).isEqualTo(result);
//        System.out.println("result = " + (result == member));
//    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Optional<Member> result = Optional.ofNullable(repository.findByName("spring1")).get();
        System.out.println("result = " + result.equals(member1));
        System.out.println("result = " + result.equals(member2));
        // assertThat(member1).isEqualTo(result);
    }
    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();
        for (Member member : result) {
            System.out.println(member.getName());
        }
        assertThat(result).hasSize(2);
    }
}
