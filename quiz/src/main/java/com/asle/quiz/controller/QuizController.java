package com.asle.quiz.controller;

import com.asle.quiz.domain.QuizDocument;
import com.asle.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    private final QuizService quizService;

    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping("/validate")
    public ResponseEntity<Boolean> validate(@RequestBody Map<String, String> request) {

        String quizId = request.get("quizId");
        String questionId = request.get("questionId");
        String answer = request.get("answer");

        return ResponseEntity.ok(quizService.isCorrectAnswer(quizId, questionId, answer));
    }

    @GetMapping("")
    public ResponseEntity<List<QuizDocument>> findAll() {

        return ResponseEntity.ok(quizService.findAll());
    }
}
