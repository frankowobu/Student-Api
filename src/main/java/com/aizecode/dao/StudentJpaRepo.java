package com.aizecode.dao;

import com.aizecode.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJpaRepo extends JpaRepository<Student,Integer> {
    //no code allowed in here;
}
