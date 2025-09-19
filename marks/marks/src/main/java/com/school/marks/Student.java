package com.school.marks;

import java.util.List;

public class Student {
    
       private int id;
        private String name;
        private int marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public Student(){}
    
    public void printStudentRankings(List<Student> studentList){
        studentList.sort((s1,s2)->{
            if(s1.getMarks()!= s2.getMarks()){
                return Integer.compare(s2.getMarks(),s1.getMarks());
            }
            else{
                return Integer.compare(s1.getId(),s2.getId());
            }
        });
        for(Student s:studentList){
            System.out.println(s);
        }
    }
}
