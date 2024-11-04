package com.Harshavardhan.SpringSecurity.repository;

import com.Harshavardhan.SpringSecurity.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}
