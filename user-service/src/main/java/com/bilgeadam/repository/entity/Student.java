package com.bilgeadam.repository.entity;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SuperBuilder(toBuilder = true)
public class Student extends Person{
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long registrationId;
    private long registrationDate;
    @ManyToMany
    @JoinTable(name = "students_course", joinColumns = {
            @JoinColumn(name = "student_id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "course_id")
    })
    private Set<Course> courses;
}
