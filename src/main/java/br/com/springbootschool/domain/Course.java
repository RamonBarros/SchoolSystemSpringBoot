package br.com.springbootschool.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="course_id")
    private Long idCourse;
}
