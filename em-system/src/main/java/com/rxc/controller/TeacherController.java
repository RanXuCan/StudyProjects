package com.rxc.controller;

import com.rxc.Service.TeacherService;
import com.rxc.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author RanXuCan
 * @Date 2020/10/4 18:23
 */
@Controller
@SessionAttributes("teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping("/teacherLogin")
    public String teacherLogin() {
        return "teacher_login";
    }

    @PostMapping("/teacherLogin")
    public String teacherLogin(String no, String password, Model model) {
        if (teacherService.teacherLogin(no, password, model))
            return "teacher_index";
        else return "teacher_login";
    }

    @GetMapping("teacherChooseCourse")
    public String teacherChooseCourse(Model model) {
        teacherService.teacherChooseCourse(model);
        return "teacher_choose_course";
    }

    @GetMapping("teacherChooseCourseClick")
    public String teacherChooseCourse(String cno, Model model) {
        return "teacher_choose_course";
    }

    @GetMapping("teacherQuitCourse")
    public String teacherQuitCourse(String cno, Model model) {
        return "teacher_choose_course";
    }

    @GetMapping("teacherSeeCourse")
    public String teacherSeeCourse() {
        return "teacher_index";
    }

    @GetMapping("teacherManageScore")
    public String teacherManageScore() {
        return "teacher_index";
    }

    @PostMapping("teacherFindCourse")
    public String teacherFindCourse(@RequestParam("courseInfor") String courseInfor) {

        return "teacher_choose_course";
    }
}
