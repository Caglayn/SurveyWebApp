package com.bilgeadam.repository.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee extends Person{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
}
