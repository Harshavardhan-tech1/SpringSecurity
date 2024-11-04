package com.Harshavardhan.SpringSecurity.controller;


import com.Harshavardhan.SpringSecurity.model.Student;
import com.Harshavardhan.SpringSecurity.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.server.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

//    private List<Student> students=new ArrayList<>(List.of(
//            new Student(1,"Harsha",30),
//            new Student(2,"HarshaCh",22),
//            new Student(3,"HarshaVardhan",26),
//            new Student(4,"Harshavardhan",20)
//
//    ));

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getData();

    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/save")
    public Student register(@RequestBody Student student){
        return studentService.create(student);
    }

//    @GetMapping("/csrf-token")
//    public CsrfToken getCsrfToken(HttpServletRequest request) {
//        CsrfToken csrfToken = (CsrfToken) request.getAttribute("_csrf");
//        return csrfToken;
//    }

//    @GetMapping("/csrf-token")
//    public CsrfToken getCsrfToken(HttpServletRequest request) {
//        Object csrfAttribute = request.getAttribute("_csrf");
//
//        if (csrfAttribute instanceof Supplier) {
//            // If CSRF attribute is a Supplier, get the CsrfToken from it
//            return ((Supplier<CsrfToken>) csrfAttribute).get();
//        } else if (csrfAttribute instanceof CsrfToken) {
//            // If it's directly a CsrfToken, cast and return it
//            return (CsrfToken) csrfAttribute;
//        } else {
//            throw new IllegalStateException("CSRF token not found in the request attributes.");
//        }
//    }
//
//    @PostMapping("/students")
//    public Student addStudent(@RequestBody Student student){
//        students.add(student);
//        return student;
//    }
}
