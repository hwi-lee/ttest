package com.ticketing.seat.repository;

import com.ticketing.seat.entity.Match;
import com.ticketing.seat.entity.Match.MatchStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchRepository extends JpaRepository<Match, Long> {

    // 동기화 대상 찾을 때 쓸 수 있는 헬퍼들
    List<Match> findByStatus(MatchStatus status);
}
