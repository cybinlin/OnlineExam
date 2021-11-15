package com.onlineexam.backend.service;

import com.onlineexam.backend.entity.Manager;
import com.onlineexam.backend.entity.Student;
import com.onlineexam.backend.entity.Teacher;

public interface LoginService {
    public Student studentLogin(Integer studentId, String password);
    public Teacher teacherLogin(Integer teacherId, String password);
    public Manager managerLogin(Integer managerId, String password);
}
