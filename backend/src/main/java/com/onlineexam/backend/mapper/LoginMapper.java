package com.onlineexam.backend.mapper;

import com.onlineexam.backend.entity.Manager;
import com.onlineexam.backend.entity.Student;
import com.onlineexam.backend.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

/**
 *
 */
@Mapper
public interface LoginMapper {
    @Select("select * from student where student_id = #{studentId}")
    Student getStudentById(Integer studentId);

    @Select("select * from teacher where teacher_id = #{teacherId}")
    Teacher getTeacherById(Integer teacherId);

    @Select("select * from manager where manager_id = #{managerId}")
    Manager getManagerById(Integer managerId);
}
