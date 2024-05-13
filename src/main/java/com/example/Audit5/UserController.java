package com.example.Audit5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@org.springframework.stereotype.Controller
class Controller extends UserServiceImpl {
    @GetMapping(value = "/v1/users/{id}")
    @ResponseBody
    public User getMethod(@PathVariable Integer id) {
        return getUser(id);
    }
}
