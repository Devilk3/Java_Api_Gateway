/*package com.quiz.controllers;
 
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
 
@RestController
@RequestMapping("/quiz-test")
public class DQuizController {
 
	private DQuizService DquizService;
	
	public DQuizController(DQuizService DquizService) {
        this.DQuizService = DquizService;
    }
	
	@GetMapping
    public List<Quiz> get() {
        return DquizService.get();
    }
	
	
    @GetMapping
    public String quizTest(){
        return "This is quiz test controller";
    }
    

    
}*/