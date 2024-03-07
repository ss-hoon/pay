package com.pay.membership.application.service;

import com.pay.membership.application.port.in.RegisterMembershipCommand;
import com.pay.membership.application.port.in.RegisterMembershipUseCase;
import com.pay.membership.domain.Membership;

public class RegisterMembershipService implements RegisterMembershipUseCase {

    @Override
    public Membership registerMembership(final RegisterMembershipCommand command) {

        // Command -> DB

        // Business Logic -> DB

        // external system (port -> adapter)

        return null;
    }
}
