package com.Harshavardhan.SpringSecurity.service;


import com.Harshavardhan.SpringSecurity.model.Student;
import com.Harshavardhan.SpringSecurity.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student create(Student st){
        return studentRepo.save(st);
    }

    public List<Student> getData(){
        return studentRepo.findAll();
    }
}
