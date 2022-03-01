package com.bilgeadam.repository.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SuperBuilder(toBuilder = true)
public class Employee extends Person{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
}
