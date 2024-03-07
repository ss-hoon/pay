package com.pay.membership.application.port.in;

import com.pay.membership.domain.Membership;
import common.UseCase;

@UseCase
public interface RegisterMembershipUseCase {

    Membership registerMembership(RegisterMembershipCommand command);
}
