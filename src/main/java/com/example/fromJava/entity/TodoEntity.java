package com.example.fromJava.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Entity
@Table(name = "todo")
public class TodoEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

}