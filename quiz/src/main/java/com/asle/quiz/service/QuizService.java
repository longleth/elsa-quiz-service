package com.asle.quiz.service;

import com.asle.quiz.domain.QuizDocument;
import com.asle.quiz.repository.QuizRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    private final QuizRepository quizRepository;

    @Autowired
    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public List<QuizDocument> findAll() {
        return quizRepository.findAll();
    }

    public boolean isCorrectAnswer(String quizId, String questionId, String answer) {
        return quizRepository.findByQuizIdAndQuestionIdAndAnswer(quizId, questionId, answer).isPresent();
    }
}
