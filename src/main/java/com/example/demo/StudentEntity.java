package com.example.demo;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
    @Id
    private String indexNo;
    private String name;
    private Date doc;
    private double gpa;
}
