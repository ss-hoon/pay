package com.pay.membership.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor(access = PRIVATE)
@Getter
public class Membership {

    private final String id;
    private final String name;
    private final String email;
    private final String address;
    private final boolean isValid;
    private final boolean isCorp;

    public static Membership generateMember(Id id, Name name, Email email, Address address, IsValid isValid, IsCorp isCorp) {
        return new Membership(id.id, name.name, email.email, address.address, isValid.isValid, isCorp.isCorp);
    }

    @Value
    public static class Id {
        String id;

        public Id(String value) {
            this.id = value;
        }
    }

    @Value
    public static class Name {
        String name;

        public Name(String value) {
            this.name = value;
        }
    }

    @Value
    public static class Email {
        String email;

        public Email(String value) {
            this.email = value;
        }
    }

    @Value
    public static class Address {
        String address;

        public Address(String value) {
            this.address = value;
        }
    }

    @Value
    public static class IsValid {
        boolean isValid;

        public IsValid(boolean value) {
            this.isValid = value;
        }
    }

    @Value
    public static class IsCorp {
        boolean isCorp;

        public IsCorp(boolean value) {
            this.isCorp = value;
        }
    }
}
