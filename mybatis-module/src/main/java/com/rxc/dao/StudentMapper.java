package com.rxc.dao;

import com.rxc.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> getAllStudent();

    Student getStudentBySno(String sno);

    int addStudent(Student student);
}
