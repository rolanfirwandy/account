package com.tracker.pilot.account.service;

import com.tracker.pilot.account.model.Ping;

import java.util.Optional;

public interface IPingService {
    Ping saveOrUpdate(Ping ping);
    Optional<Ping> findByUserId(Long userId);
}
