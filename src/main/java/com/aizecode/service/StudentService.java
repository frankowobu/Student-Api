package com.aizecode.service;

import com.aizecode.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public List<Student> getList();
    public Optional<Student> getStudent(int theId);
    public void addStudent(Student student);
    public void deleteStudent(int theId);
}
