# elsa-quiz-service

# Prerequisites 

- JDK: 17.x.x
- Maven

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
