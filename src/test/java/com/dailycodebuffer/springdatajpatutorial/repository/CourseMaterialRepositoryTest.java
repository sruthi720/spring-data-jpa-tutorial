package com.dailycodebuffer.springdatajpatutorial.repository;

import com.dailycodebuffer.springdatajpatutorial.entity.Course;
import com.dailycodebuffer.springdatajpatutorial.entity.CourseMaterial;
import jakarta.servlet.http.PushBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;


    //save the course material with course
    @Test
    public void saveCourseMaterial(){

        Course course = Course.builder()
                .title("springBoot")
                .credit(6)
                .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("WWW.dailycode.com")
                .course(course)
                .build();

        courseMaterialRepository.save(courseMaterial);
    }


    @Test
    public  void printAllCourseMaterials(){
        List<CourseMaterial> courseMaterials =
                courseMaterialRepository.findAll();
        System.out.println("CourseMaterial ="+ courseMaterials);
    }
}