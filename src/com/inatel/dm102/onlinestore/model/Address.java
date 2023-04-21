package com.inatel.dm102.onlinestore.model;

import java.util.UUID;

public class Address {
    private String id  = UUID.randomUUID().toString();
    private String street;
    private String number;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    public Address(String street, String number, String complement, String neighborhood, String city, String state, String country, String zipCode) {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public Address() {
    }

    public String getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry(){
        return country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setComplement(String complement){
        this.complement = complement;
    }

    public void setNeighborhood(String neighborhood){
        this.neighborhood = neighborhood;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setState(String state){
        this.state = state;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" + "id=" + id + ", street=" + street + ", number=" + number + ", complement=" + complement + ", neighborhood=" + neighborhood + ", city=" + city + ", state=" + state + ", country=" + country + ", zipCode=" + zipCode + '}';
    }
}
