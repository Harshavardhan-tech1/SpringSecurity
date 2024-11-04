package com.Harshavardhan.SpringSecurity.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="student_table")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int marks;

//    @JoinColumn
//    @OneToOne(cascade = CascadeType.ALL)
//    private Users users;


//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private Users users;


//@OneToOne(cascade = CascadeType.PERSIST)
//@JoinColumn(name = "user_id", referencedColumnName = "userId")
//private Users users;

//    public Student(){
//
//    }
//
//    public Student(String name, int marks, Users users) {
//        this.name = name;
//        this.marks = marks;
//        this.users = users;
//    }

//    public Users getUsers() {
//        return users;
//    }
//
//    public void setUsers(Users users) {
//        this.users = users;
//    }

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

    public long getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
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
}
