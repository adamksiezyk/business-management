package com.buisness.management.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Address {
    Integer id;
    String street;
    String city;
    Integer number;
    String postalCode;
}
