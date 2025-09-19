package com.school.marks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class MarksApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarksApplication.class, args);


        ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");

        ArrayList<Student> arr = (ArrayList<Student>) ap.getBean("markings");
        Student st = new Student();
        st.printStudentRankings(arr);
    }
}