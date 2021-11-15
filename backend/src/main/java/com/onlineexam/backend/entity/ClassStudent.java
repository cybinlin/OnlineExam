package com.onlineexam.backend.entity;

import org.springframework.stereotype.Component;

@Component
public class ClassStudent {
    Integer studentId;
    Integer classId;

    @Override
    public String toString() {
        return "ClassStudent{" +
                "studentId=" + studentId +
                ", classId=" + classId +
                '}';
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

}
