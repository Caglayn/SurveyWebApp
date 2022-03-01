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
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String courseCode;
    private String name;
    private long startDate;
    private long endDate;

    @ManyToOne
    @JoinColumn(name = "master_trainer_id")
    private Teacher masterTrainer;

    @ManyToOne
    @JoinColumn(name = "assistant_trainer_id")
    private Teacher assistantTrainer;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;
}
