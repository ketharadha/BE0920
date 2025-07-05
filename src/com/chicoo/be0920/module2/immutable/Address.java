package com.chicoo.be0920.module2.immutable;

public final class Address {
    private final int houseNumber;
    private final String street1;
    private final String street2;
    private final String province;
    private final String city;
    private final String Country;
    private final String pinCode;

    public Address(int houseNumber, String street1, String street2, String province, String city, String country, String pinCode) {
        this.houseNumber = houseNumber;
        this.street1 = street1;
        this.street2 = street2;
        this.province = province;
        this.city = city;
        Country = country;
        this.pinCode = pinCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getStreet1() {
        return street1;
    }

    public String getStreet2() {
        return street2;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return Country;
    }

    public String getPinCode() {
        return pinCode;
    }

}
