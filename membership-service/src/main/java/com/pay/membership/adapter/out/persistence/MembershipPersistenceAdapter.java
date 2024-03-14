package com.pay.membership.adapter.out.persistence;

import com.pay.membership.application.port.out.FindMembershipPort;
import com.pay.membership.application.port.out.RegisterMembershipPort;
import com.pay.membership.domain.Membership;
import common.PersistenceAdapter;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class MembershipPersistenceAdapter implements RegisterMembershipPort, FindMembershipPort {

    private final SpringDataMembershipRepository membershipRepository;

    @Override
    public MembershipJpaEntity createMembership(final Membership.Name name, final Membership.Email email, final Membership.Address address, final Membership.IsValid isValid, final Membership.IsCorp isCorp) {
        return membershipRepository.save(new MembershipJpaEntity(name.getName(), email.getEmail(), address.getAddress(), isValid.isValid(), isCorp.isCorp()));
    }

    @Override
    public MembershipJpaEntity findMembership(final Membership.Id id) {
        return membershipRepository.getById(Long.parseLong(id.getId()));
    }
}
