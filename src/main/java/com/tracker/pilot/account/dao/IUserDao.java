package com.tracker.pilot.account.dao;

import com.tracker.pilot.account.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDao extends JpaRepository<User, Long> {
}
