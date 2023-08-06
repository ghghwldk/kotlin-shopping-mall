package com.example.portfolio.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "todo")
public class TodoEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;
}