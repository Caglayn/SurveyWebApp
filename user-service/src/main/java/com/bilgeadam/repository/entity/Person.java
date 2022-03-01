package com.bilgeadam.repository.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
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
