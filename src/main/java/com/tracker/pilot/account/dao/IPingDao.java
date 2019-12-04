package com.tracker.pilot.account.dao;

import com.tracker.pilot.account.model.Ping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IPingDao extends JpaRepository<Ping, Long> {
    Optional<Ping> findByUserId(Long userId);
}
