package com.example.Sheer.Question;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/question")
public class QuestionController {

    private final QuestionService questionService;


    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/save")
    @ResponseBody
    public String Save(@RequestBody  Question question){
        return questionService.Save(question);
    }

    @GetMapping("/getall")
    public List<Question> Getall(){

        return questionService.Getall();
    }
}
