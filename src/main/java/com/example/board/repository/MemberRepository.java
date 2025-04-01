package com.example.board.repository;

import com.example.board.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    default Member findByIdOrElseThrow(Long id) {
        return null;
    }

    Member findMemberByUsername(String username);
}
