# elsa-quiz-service

# Prerequisites 

- JDK: 17.x.x
- Maven
- MongoDB

- Database import - local MongoDB server is required.
- Manually import [repo: /quiz/src/main/resources/elsa.quiz.json] quiz document data into your local MongoDB,
which is DEFAULT as:

  host:       localhost 
  port:       27017
  database:   elsa

# Local startup

Navigate to your project directory on local (pulled from GitHub repository)

> mvn clean install
> java -jar target/quiz-0.0.1-SNAPSHOT.jar
>

# ENDPOINT TEST USING POSTMAN

Authentication: NO

GET: http://localhost:8081/api/quiz
Response: OK
Response JSON Body:
  [
    {
      "quizId": "686923eb6af25b779321f0f6",
      "questions": [
        {
          "questionId": "question_1",
          "content": "Vocabulary A, Vocabulary B, Vocabulary C",
          "answer": "A"
        },
        {
          "questionId": "question_2",
          "content": "Vocabulary A, Vocabulary B, Vocabulary C",
          "answer": "B"
        },
        {
          "questionId": "question_3",
          "content": "Vocabulary A, Vocabulary B, Vocabulary C",
          "answer": "C"
        }
      ]
    },
    {
      "quizId": "68692ab76af25b779321f0f9",
      "questions": [
        {
          "questionId": "question_1",
          "content": "Vocabulary E, Vocabulary F, Vocabulary G",
          "answer": "E"
        },
        {
          "questionId": "question_2",
          "content": "Vocabulary E, Vocabulary F, Vocabulary G",
          "answer": "F"
        },
        {
          "questionId": "question_3",
          "content": "Vocabulary E, Vocabulary F, Vocabulary G",
          "answer": "G"
        }
      ]
    }
  ]
