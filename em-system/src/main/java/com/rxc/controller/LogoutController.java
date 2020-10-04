package com.rxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Description:
 * @Author RanXuCan
 * @Date 2020/10/2 16:27
 */
@Controller
public class LogoutController {
    @GetMapping("/logout")
    public String logout() {

        return "index";
    }

    @GetMapping("/managerLogin")
    public  String managerLogin(){
        return "manager_login";
    }

    @PostMapping("/managerLogin")
    public String managerLogin(String managerAccount, String managerPassword, Model model) {
        if ("admin".equals(managerAccount.trim()) && "admin".equals(managerPassword)) {
            return "manager_index";
        }
        model.addAttribute("message", "账号或密码错误");
        return "manager_login";
    }
}
