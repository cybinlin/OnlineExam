package com.onlineexam.backend.entity;

import org.springframework.stereotype.Component;

@Component
public class Paper {
    Integer paperId;
    Integer teacherId;
    String paperName;
    String startTime;
    String endTime;
    Float totalScore;
    String tips;
    Integer state;

    @Override
    public String toString() {
        return "Paper{" +
                "paperId=" + paperId +
                ", teacherId=" + teacherId +
                ", paperName='" + paperName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", totalScore=" + totalScore +
                ", tips='" + tips + '\'' +
                ", state=" + state +
                '}';
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Float getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Float totalScore) {
        this.totalScore = totalScore;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}
