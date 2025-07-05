package com.asle.quiz.repository;

import com.asle.quiz.domain.QuizDocument;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuizRepository extends MongoRepository<QuizDocument, String> {

    @Query(value = "{ 'quizId': ?0, 'questions': { $elemMatch: { 'questionId': ?1, 'answer': ?2 } } }")
    Optional<QuizDocument> findByQuizIdAndQuestionIdAndAnswer(String quizId, String questionId, String answer);
}
