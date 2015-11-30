package com.jpamodeler.embeddable;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable

public class Address implements Serializable {

    @ElementCollection
    private Collection<String> phone;

    @Embedded
    private Zipcode zipcode;

    @Basic
    private String street;

    @Basic
    private String state;

    @Basic
    private String country;

    @Basic
    private String city;

    public Address() {

    }

    public Collection<String> getPhone() {
        return this.phone;
    }

    public void setPhone(Collection<String> phone) {
        this.phone = phone;
    }

    public Zipcode getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(Zipcode zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
