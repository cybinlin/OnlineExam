package com.onlineexam.backend.entity;

import org.springframework.stereotype.Component;

@Component
public class Score {
    Integer paperId;
    Integer studentId;
    Float singleScore;
    Float mutipleScore;
    Float score;
    String submitTime;

    @Override
    public String toString() {
        return "Score{" +
                "paperId=" + paperId +
                ", studentId=" + studentId +
                ", singleScore=" + singleScore +
                ", mutipleScore=" + mutipleScore +
                ", score=" + score +
                ", submitTime='" + submitTime + '\'' +
                '}';
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Float getSingleScore() {
        return singleScore;
    }

    public void setSingleScore(Float singleScore) {
        this.singleScore = singleScore;
    }

    public Float getMutipleScore() {
        return mutipleScore;
    }

    public void setMutipleScore(Float mutipleScore) {
        this.mutipleScore = mutipleScore;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

}
