package ru.smartcampus.smartcampus.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "intents")
public class Intent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "tag")
    private String tag;

    @OneToMany(mappedBy = "intent")
    private List<Pattern> patterns;

    @OneToMany(mappedBy = "intent")
    private List<Response> responses;

    @OneToMany(mappedBy = "intent")
    private List<Context> contexts;
}