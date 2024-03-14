package com.pay.membership.adapter.in.web;


import com.pay.membership.application.port.in.FindMembershipCommand;
import com.pay.membership.application.port.in.FindMembershipUseCase;
import com.pay.membership.domain.Membership;
import common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
@RequestMapping("/membership")
public class FindMembershipController {

    private final FindMembershipUseCase findMembershipUseCase;

    @GetMapping("/{id}")
    ResponseEntity<Membership> findMembershipById(@PathVariable String id) {

        // Request -> Command
        FindMembershipCommand command = FindMembershipCommand.builder()
                                                             .id(id)
                                                             .build();

        // Usecase
        return ResponseEntity.ok(findMembershipUseCase.findMembership(command));
    }

}
