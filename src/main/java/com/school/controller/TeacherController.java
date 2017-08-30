package com.school.controller;

import com.school.domain.Teacher;
import com.school.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.List;


@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/")
    public String home(Model model) {
        List<Teacher> teachers= teacherService.findAll();
        model.addAttribute("teachers", teachers);
        return "hello";
    }
}
