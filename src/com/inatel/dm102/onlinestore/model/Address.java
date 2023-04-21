package com.inatel.dm102.onlinestore.model;

import java.util.UUID;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {
    private String id = UUID.randomUUID().toString();
    private String street;
    private String number;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    private final String DEFAULT_ZIPCODE = "37540-000";
    private final String DEFAULT_CITY = "Santa Rita do Sapucaí";
    private final String DEFAULT_STATE = "Minas Gerais";

    public Address(String street, String number, String complement, String neighborhood, String city, String state,
            String country, String zipCode) {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public void fillAddressByZipcode() {
        if (this.zipCode.equals(DEFAULT_ZIPCODE)) {
            this.city = DEFAULT_CITY;
            this.state = DEFAULT_STATE;
        }
    }
}
