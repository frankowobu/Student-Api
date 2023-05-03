package com.aizecode.service;

import com.aizecode.dao.StudentJpaRepo;
import com.aizecode.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentJpaRepo studentJpaRepo;
    @Autowired
    public StudentServiceImpl(StudentJpaRepo studentJpaRepo) {
        this.studentJpaRepo = studentJpaRepo;
    }

    @Override
    public List<Student> getList() {
        return studentJpaRepo.findAll();
    }

    @Override
    public Optional<Student> getStudent(int theId) {
        return studentJpaRepo.findById(theId);
    }

    @Override
    public void addStudent(Student student) {
        studentJpaRepo.save(student);
    }

    @Override
    public void deleteStudent(int theId) {
        studentJpaRepo.deleteById(theId);
    }
}
