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
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String topicCode;
    private String name;
    private String description;

    @ManyToMany(mappedBy = "topics")
    private Set<Teacher> teachers;
}
