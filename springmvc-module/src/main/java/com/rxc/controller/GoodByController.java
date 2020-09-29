package com.rxc.controller;

import com.rxc.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author RanXuCan
 * @Date 2020/9/28 16:31
 */
@Controller
public class GoodByController {

    //    @RequestMapping(path = "/goodBy", method = RequestMethod.GET)
    @GetMapping("/goodBy")
    public String goodBy(String username, Model model) {
        model.addAttribute("username", username);
        return "goodBy";
    }

    @GetMapping("/seeStudent")
    public String seeStudent(Student student, Model model) {
        model.addAttribute("student", student);
        return "studentInformation";
    }
}
