package com.onlineexam.backend.entity;

import org.springframework.stereotype.Component;

@Component
public class Question {
    Integer questionId;
    Integer paperId;
    String title;
    String answer;
    String analyse;
    Float Score;
    Integer questionType;
    String optionA;
    String optionB;
    String optionC;
    String optionD;

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", paperId=" + paperId +
                ", title='" + title + '\'' +
                ", answer='" + answer + '\'' +
                ", analyse='" + analyse + '\'' +
                ", Score=" + Score +
                ", questionType=" + questionType +
                ", optionA='" + optionA + '\'' +
                ", optionB='" + optionB + '\'' +
                ", optionC='" + optionC + '\'' +
                ", optionD='" + optionD + '\'' +
                '}';
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnalyse() {
        return analyse;
    }

    public void setAnalyse(String analyse) {
        this.analyse = analyse;
    }

    public Float getScore() {
        return Score;
    }

    public void setScore(Float score) {
        Score = score;
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

}
