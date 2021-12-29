package com.jonarts.myquizapp.dao;


import com.jonarts.myquizapp.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface QuestionRespository extends JpaRepository<Question, Integer> {
}
