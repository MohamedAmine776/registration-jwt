package com.m7a95.registration.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {

    private final String email;
    private final String password;

    private final String firstName;
    private final String lastName;

    private final String phone;
    private final String nationality;
    private final LocalDateTime birthday;

    private final String fullAdress;
    private final String building;
    private final String flat;
    private final String city;

    private final String incomeSource;
    private final String annualIncome;
    private final String plannedInvestement;
}