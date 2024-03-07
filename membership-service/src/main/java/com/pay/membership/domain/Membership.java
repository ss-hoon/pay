package com.pay.membership.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor(access = PRIVATE)
@Getter
public class Membership {

    private final String membershipId;
    private final String name;
    private final String email;
    private final String address;
    private final boolean isValid;
    private final boolean isCorp;

    public static Membership generateMember(
            MembershipId membershipId
    ) {
        return new Membership(membershipId.membershipId);
    }

    @Value
    public static class MembershipId {
        String membershipId;

        public MembershipId(String value) {
            this.membershipId = value;
        }
    }
}
