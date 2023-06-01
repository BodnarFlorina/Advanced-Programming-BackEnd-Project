package com.example.JavaApp.Question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public void addQuestion(Question question) {
        questionRepository.save(question);
    }

    public List<Question> getAllQuestion() {
        return questionRepository.findAll();
    }

    public List<Question> getQuestionsByDifficultyAndSubjectId(Long difficulty, Long subjectId) {

        List<Question> questions = questionRepository.findByQuestionDifficultyAndSubjectId(difficulty, subjectId);
        Collections.shuffle(questions);
        int totalQuestions = questions.size();
        int numQuestionsToRetrieve = Math.min(10, totalQuestions);
        return questions.subList(0, numQuestionsToRetrieve);
    }

    public Question getQuestionById(Long questionId) {
        return questionRepository.findById(questionId)
                .orElseThrow(() -> new IllegalArgumentException("Question not found"));
    }
}

