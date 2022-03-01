package com.bilgeadam.repository.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
public abstract class Person {
    @Id
    private long id;
    private long idNumber;
    private String firstname;
    private String lastname;
    private String address;
    private String province;
    private String district;
    private String phone1;
    private String phone2;

}
