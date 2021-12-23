package com.parkshark.dudewheremycar.repository.members;

import com.parkshark.dudewheremycar.domain.members.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MemberRepository extends JpaRepository<Member, UUID> {
}
