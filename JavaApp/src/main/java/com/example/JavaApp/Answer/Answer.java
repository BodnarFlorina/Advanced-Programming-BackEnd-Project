package com.example.JavaApp.Answer;

import jakarta.persistence.*;

@Entity
@Table(name="answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long questionId;
    @Column
    private String answerText;
    @Column
    private Long correct;

    @Column
    private Long chosen;

    public Answer() {
    }

    public Answer(Long id, Long questionId, String answerText, Long correct, Long chosen) {
        this.id = id;
        this.questionId = questionId;
        this.answerText = answerText;
        this.correct = correct;
        this.chosen = chosen;
    }

    public Answer(Long questionId, String answerText, Long correct, Long chosen) {
        this.questionId = questionId;
        this.answerText = answerText;
        this.correct = correct;
        this.chosen = chosen;
    }

    public Long getChosen() {
        return chosen;
    }

    public void setChosen(Long chosen) {
        this.chosen = chosen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public Long getCorrect() {
        return correct;
    }

    public void setCorrect(Long correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", questionId=" + questionId +
                ", answerText='" + answerText + '\'' +
                ", correct=" + correct +
                '}';
    }
}
