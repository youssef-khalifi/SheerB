package com.example.Sheer.Question;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;


    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public String Save(Question question){

        questionRepository.save(question);

        return "save successfully";
    }

    public List<Question> Getall(){

            return questionRepository.findAll();
    }
}
