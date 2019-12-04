package com.tracker.pilot.account.service;

import com.tracker.pilot.account.model.User;

import java.util.Optional;

public interface IUserService {
    User saveOrUpdate(User user);
    Optional<User> findById(Long id);
}
