package com.onlineexam.backend.entity;

import org.springframework.stereotype.Component;

@Component
public class Class {
    Integer classId;
    Integer teacherId;
    String className;
    Integer paperId;

    @Override
    public String toString() {
        return "Class{" +
                "classId=" + classId +
                ", teacherId=" + teacherId +
                ", className='" + className + '\'' +
                ", paperId=" + paperId +
                '}';
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

}
