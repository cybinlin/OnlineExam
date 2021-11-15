package com.onlineexam.backend.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Answer {
    Integer studentId;
    Integer questionId;
    String answer;
    Float Score;
    @Override
    public String toString() {
        return "Answer{" +
                "studentId=" + studentId +
                ", questionId=" + questionId +
                ", answer='" + answer + '\'' +
                ", Score=" + Score +
                '}';
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Float getScore() {
        return Score;
    }

    public void setScore(Float score) {
        Score = score;
    }


}
