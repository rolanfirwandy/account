package com.tracker.pilot.account.controller;

import com.tracker.pilot.account.model.Ping;
import com.tracker.pilot.account.service.IPingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/ping")
public class PingController {

    @Autowired
    private IPingService pingService;

    @GetMapping("/{userId}")
    private Ping pingDatabase(@PathVariable("userId") Long userId) {
        Optional<Ping> data = pingService.findByUserId(userId);
        Ping ping;
        if (data.isPresent()) {
            ping = data.get();
        } else {
            ping = new Ping();
            ping.setUserId(userId);
        }
        ping.setUpdatedAt(new Date());
        return pingService.saveOrUpdate(ping);
    }

    @GetMapping("/conn")
    private String pingConnection() {
        return "OK";
    }
}
