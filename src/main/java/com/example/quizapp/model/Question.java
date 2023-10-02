package com.example.quizapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String questionTitle;

    @Column
    private String option1;

    @Column
    private String option2;

    @Column
    private String option3;
    
    @Column
    private String option4;

    @Column
    private String rightAnswer;

    @Column
    private String difficultyLevel;

    @Column
    private String category;


    
}
