package com.school.controller.rest;

import com.school.domain.Teacher;
import com.school.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/teacher")
public class TeacherRestController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/getAll")
    public List<Teacher> home() {
        List<Teacher> teachers = teacherService.findAll();
        return teachers;
    }
}
