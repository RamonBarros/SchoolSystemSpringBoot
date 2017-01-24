package br.com.springbootschool.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="teacher_id")
    private Long idTeacher;
    
}
