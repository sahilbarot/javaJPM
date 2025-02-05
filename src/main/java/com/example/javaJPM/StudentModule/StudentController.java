package com.example.javaJPM.StudentModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController
{

    @Autowired
    StudentService studentService;


    @RequestMapping(method = RequestMethod.POST,value="/student")
    public String addStudent(@RequestBody Student student)
    {
        studentService.addStudent(student);
        return "Recored has been added Successfully";
    }

    @RequestMapping(method = RequestMethod.GET,value="/student")
    public List<Student> getAllStudents()
    {
        return     studentService.viewStudents();
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/student")
    public String updateStudent(@RequestBody Student student)
    {
        studentService.updateStudent(student);
        return "Recored has been updated Successfully";
    }

    @RequestMapping(method = RequestMethod.DELETE,value="/student")
    public String deleteStudent(@RequestBody Student student){
        studentService.deleteStudent(student);
        return "Recored has been deleted Successfully";
    }


}
