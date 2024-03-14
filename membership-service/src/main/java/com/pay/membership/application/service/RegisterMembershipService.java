package com.pay.membership.application.service;

import com.pay.membership.adapter.out.persistence.MembershipJpaEntity;
import com.pay.membership.adapter.out.persistence.MembershipMapper;
import com.pay.membership.application.port.in.RegisterMembershipCommand;
import com.pay.membership.application.port.in.RegisterMembershipUseCase;
import com.pay.membership.application.port.out.RegisterMembershipPort;
import com.pay.membership.domain.Membership;
import common.UseCase;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
@Transactional
public class RegisterMembershipService implements RegisterMembershipUseCase {

    private final RegisterMembershipPort registerMembershipPort;

    private final MembershipMapper membershipMapper;

    @Override
    public Membership registerMembership(final RegisterMembershipCommand command) {
        MembershipJpaEntity jpaEntity = registerMembershipPort.createMembership(
                new Membership.Name(command.getName()),
                new Membership.Email(command.getEmail()),
                new Membership.Address(command.getAddress()),
                new Membership.IsValid(command.isValid()),
                new Membership.IsCorp(command.isCorp())
        );

        return membershipMapper.mapToDomainEntity(jpaEntity);
    }
}
