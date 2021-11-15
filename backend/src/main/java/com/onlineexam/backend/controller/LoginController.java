package com.onlineexam.backend.controller;

import com.onlineexam.backend.entity.Manager;
import com.onlineexam.backend.entity.Student;
import com.onlineexam.backend.entity.Teacher;
import com.onlineexam.backend.service.impl.LoginServiceImpl;
import com.onlineexam.backend.utils.JsonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    private LoginServiceImpl loginServiceImpl;

    @Autowired
    public void setLoginService(LoginServiceImpl loginServiceImpl) {
        this.loginServiceImpl = loginServiceImpl;
    }

    @RequestMapping(value = "/studentLogin")
    @ResponseBody
    public JsonResult studentLogin(Integer studentId, String password) {
        Student student = loginServiceImpl.studentLogin(studentId, password);
        if(student == null) {
            return new JsonResult("登录失败");
        }
        else {
            return new JsonResult(student);
        }
    }

    @RequestMapping(value = "/teacherLogin")
    @ResponseBody
    public JsonResult teacherLogin(Integer teacherId, String password) {
        Teacher teacher = loginServiceImpl.teacherLogin(teacherId, password);
        if(teacher == null) {
            return new JsonResult("登录失败");
        }
        else {
            return new JsonResult(teacher);
        }
    }

    @RequestMapping(value = "/managerLogin")
    @ResponseBody
    public JsonResult managerLogin(Integer managerId, String password) {
        Manager manager = loginServiceImpl.managerLogin(managerId, password);
        if (manager == null) {
            return new JsonResult("登录失败");
        }
        else {
            return new JsonResult(manager);
        }
    }
}
