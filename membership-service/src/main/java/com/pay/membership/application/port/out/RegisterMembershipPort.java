package com.pay.membership.application.port.out;

import com.pay.membership.domain.Membership;

public interface RegisterMembershipPort {

    void createMembership(
            Membership.name name
    )
}
