package com.tracker.pilot.account.service;

import com.tracker.pilot.account.dao.IPingDao;
import com.tracker.pilot.account.model.Ping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PingService implements IPingService {

    @Autowired
    private IPingDao pingDao;

    @Override
    public Ping saveOrUpdate(Ping ping) {
        return pingDao.save(ping);
    }

    @Override
    public Optional<Ping> findByUserId(Long userId) {
        return pingDao.findByUserId(userId);
    }
}
