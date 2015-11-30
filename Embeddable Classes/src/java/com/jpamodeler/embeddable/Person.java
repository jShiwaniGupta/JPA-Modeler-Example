package com.jpamodeler.embeddable;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Person implements Serializable {

    @Id
    private Long id;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "street", column = @Column(name = "h_street")),
        @AttributeOverride(name = "zipcode.mainCode", column = @Column(name = "h_maincode")),
        @AttributeOverride(name = "city", column = @Column(name = "h_city")),
        @AttributeOverride(name = "state", column = @Column(name = "h_state")),
        @AttributeOverride(name = "country", column = @Column(name = "h_country")),
        @AttributeOverride(name = "zipcode.codeSuffix", column = @Column(name = "h_codesuffix")),
        @AttributeOverride(name = "phone", column = @Column(name = "H_PHONE", table = "zxZ"))})
    private Address homeAddress;

    @Basic
    private String age;

    @Basic
    private String name;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "zipcode.codeSuffix", column = @Column(name = "o_codesuffix")),
        @AttributeOverride(name = "zipcode.mainCode", column = @Column(name = "o_maincode")),
        @AttributeOverride(name = "street", column = @Column(name = "o_street")),
        @AttributeOverride(name = "city", column = @Column(name = "o_city")),
        @AttributeOverride(name = "state", column = @Column(name = "o_state")),
        @AttributeOverride(name = "country", column = @Column(name = "o_country")),
        @AttributeOverride(name = "phone", column = @Column(name = "O_PHONE"))})
    private Address officeAddress;

    public Person() {

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getHomeAddress() {
        return this.homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getOfficeAddress() {
        return this.officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }
}
