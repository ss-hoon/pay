package com.pay.membership.adapter.in.web;

import com.pay.membership.application.port.in.RegisterMembershipCommand;
import com.pay.membership.application.port.in.RegisterMembershipUseCase;
import com.pay.membership.domain.Membership;
import common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
@RequestMapping("/membership")
public class RegisterMembershipController {

    private final RegisterMembershipUseCase registerMembershipUseCase;

    @PostMapping("/register")
    ResponseEntity<Membership> registerMembership(@RequestBody RegisterMembershipRequest request) {

        // Request -> Command
        RegisterMembershipCommand command = RegisterMembershipCommand.builder()
                                                                     .name(request.getName())
                                                                     .email(request.getEmail())
                                                                     .address(request.getAddress())
                                                                     .isValid(true)
                                                                     .isCorp(request.isCorp())
                                                                     .build();

        // Usecase
        return ResponseEntity.ok(registerMembershipUseCase.registerMembership(command));
    }
}
