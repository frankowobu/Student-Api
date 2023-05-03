package com.aizecode.rest;

import com.aizecode.entity.Student;
import com.aizecode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private final StudentService studentService;
    @Autowired
    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }
    //Get all the student in the datatbase
    @GetMapping("/student")
    public List<Student> getAll(){
        return studentService.getList();
    }
    @GetMapping("/student/{student_id}")
    public Optional<Student> findById(@PathVariable int student_id){
        return studentService.getStudent(student_id);
    }
    @PostMapping("/student")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    //to check for student
    @DeleteMapping("/student/{student_id}")
    public String delById(@PathVariable int student_id){
        return "id " + student_id + " has been deleted";
    }
}
