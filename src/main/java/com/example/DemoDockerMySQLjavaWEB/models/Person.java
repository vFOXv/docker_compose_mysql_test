package com.example.DemoDockerMySQLjavaWEB.models;

import jakarta.persistence.*;
import lombok.*;
@Entity
@NoArgsConstructor
@Data
@Table(name="people", schema = "USER_APP")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;
}
