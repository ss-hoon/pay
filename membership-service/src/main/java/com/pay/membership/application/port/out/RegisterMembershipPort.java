package com.pay.membership.application.port.out;

import com.pay.membership.adapter.out.persistence.MembershipJpaEntity;
import com.pay.membership.domain.Membership;

public interface RegisterMembershipPort {

    MembershipJpaEntity createMembership(Membership.Name name, Membership.Email email, Membership.Address address, Membership.IsValid isValid, Membership.IsCorp isCorp);
}
