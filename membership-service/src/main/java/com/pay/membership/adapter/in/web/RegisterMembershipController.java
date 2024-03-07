package com.pay.membership.adapter.in.web;

import common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
@RequestMapping("/membership")
public class RegisterMembershipController {

    @PostMapping("/register")
    void registerMembership(@RequestBody RegisterMembershipRequest request) {
        // Request

        // Request -> Command

        // Usecase
    }
}
