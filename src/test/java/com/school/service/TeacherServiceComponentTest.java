package com.school.service;

import com.school.ApplicationConfig;
import com.school.domain.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationConfig.class)
@Transactional
public class TeacherServiceComponentTest {

    @Autowired
    private TeacherService teacherService;

    @Test
    public void searchAllTeacher_dbHaveTeachers_returnTeacherList (){
        List<Teacher> teachers = teacherService.findAll();
        assertEquals(false, teachers.isEmpty());
    }
}
