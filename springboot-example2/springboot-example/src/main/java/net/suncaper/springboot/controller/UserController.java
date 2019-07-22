package net.suncaper.springboot.controller;

import net.suncaper.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String goUserListPage(Model model) {
        model.addAttribute("users", userService.listUser());
        return "userList";
    }
}
