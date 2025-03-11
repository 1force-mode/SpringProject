package org.example;
//класс-сущность

import jakarta.persistence.*;

@Entity
@Table(name = "table name")
public class Note {
    private String title;
    private String content;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "column_name", length = 100, nullable = false)
    private String fieldName;

}
