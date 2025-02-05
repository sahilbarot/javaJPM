package com.example.javaJPM.StudentModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService
{

    @Autowired
    private StudentRepo studentRepo;

    public void   addStudent(Student student)
    {
          studentRepo.save(student);

    }

    public void  updateStudent(Student student)
    {
        studentRepo.save(student);

    }

    public void deleteStudent(Student student){
        studentRepo.delete(student);

    }

    public ArrayList<Student> viewStudents(){

        ArrayList<Student> students = new ArrayList<>();

        for(Student student : studentRepo.findAll())
        {
            students.add(student);
        }

       // studentRepo.findAll().forEach(students::add);

       return students;
    }



}
