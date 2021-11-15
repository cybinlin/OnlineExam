package com.onlineexam.backend.service.impl;

import com.onlineexam.backend.entity.Manager;
import com.onlineexam.backend.entity.Student;
import com.onlineexam.backend.entity.Teacher;
import com.onlineexam.backend.mapper.LoginMapper;
import com.onlineexam.backend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    private LoginMapper loginMapper;

    @Autowired
    public void setLoginMapper(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    @Override
    public Student studentLogin(Integer studentId, String password) {
        Student student = loginMapper.getStudentById(studentId);
        if (student == null || !student.getPassword().equals(password)) {
            return null;
        }
        else {
            return student;
        }
    }

    @Override
    public Teacher teacherLogin(Integer teacherId, String password) {
        Teacher teacher = loginMapper.getTeacherById(teacherId);
        if(teacher == null || !teacher.getPassword().equals(password)) {
            return null;
        }
        else {
            return teacher;
        }
    }

    @Override
    public Manager managerLogin(Integer managerId, String password) {
        Manager manager = loginMapper.getManagerById(managerId);
        if(manager == null || !manager.getPassword().equals(password)) {
            return null;
        }
        else {
            return manager;
        }
    }
}
