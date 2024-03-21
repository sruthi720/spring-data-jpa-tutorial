package com.dailycodebuffer.springdatajpatutorial.repository;

import com.dailycodebuffer.springdatajpatutorial.entity.Course;
import com.dailycodebuffer.springdatajpatutorial.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TeacherRepositoryTest {


    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public  void saveTeacher(){

        Course courseDSA = Course.builder()
                .title("DSA")
                .credit(5)
                .build();
        Course courseJAVA = Course.builder()
                .title("JAVA")
                .credit(3)
                .build();
        Course courseML = Course.builder()
                .title("ML")
                .credit(10)
                .build();

        Teacher teacher = Teacher.builder()
                .firstName("Qtub")
                .lastName("Khan")
                .courses(List.of(courseDSA,courseJAVA))
                .build();

        teacherRepository.save(teacher);
    }
}