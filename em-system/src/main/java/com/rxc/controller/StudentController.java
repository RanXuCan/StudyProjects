package com.rxc.controller;

import com.rxc.Service.StudentService;
import com.rxc.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Description:
 * @Author RanXuCan
 * @Date 2020/9/30 16:05
 */
@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/studentLogin")
    public String studentLogin() {
        return "index";
    }

    @PostMapping("/studentLogin")
    public String studentLogin(String no, String password, Model model) {
        if (studentService.studentLogin(no, password, model)) {
            return "student_index";
        } else {
            model.addAttribute("message", "账号或密码错误");
            return "index";
        }
    }

    @GetMapping("/addStudent")
    public String addStudent() {
        return "add_student_index";
    }

    @PostMapping("/addStudent")
    public String addStudent(Student student, Model model) {
        studentService.addStudent(student, model);
        return "add_student_index";
    }
}