package com.bilgeadam.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Teacher extends Employee{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long teacherId;
    private int yearsOfexperience;

    @OneToMany(mappedBy = "masterTrainer")
    private Set<Course> masterCourses;

    @OneToMany(mappedBy = "assistantTrainer")
    private Set<Course> assistanCourses;

    @ManyToMany
    @JoinTable(name = "teachers_topic", joinColumns = {
            @JoinColumn(name = "teacher_id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "topic_id")
    })
    private Set<Topic> topics;
}
