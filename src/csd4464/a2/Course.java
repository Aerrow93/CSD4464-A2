/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.a2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/**
 *
 * @author Kelsey Bruin
 */
public class Course {

    List<Student> students = new ArrayList<Student>();

    @Override
    public String toString() {
        return "Course{" + "students=" + students + '}';
    }

    public Course() {
    }

    public Course(List<Student> students) {
        this.students = students;
    }

    public void add(Student students) {
        this.students.add(students);
    }

    public void remove(Student students) {
        this.students.remove(students);
    }

    public void remove(String id) {
        this.students.remove(id);
    }

    public void remove(int position) {
        this.students.remove(position);
    }

    public void insert(Student students, int position) {
        this.students.add(position, students);
    }

    public void get(int position) {
        this.students = students;
    }

    public void get(String id) {
        this.students = students;
    }

    public void getAll() {
        this.students = students;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Course) {
            if (this == obj) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public void getAllByGender(String gender) {
        HashSet<Student> students = new HashSet<>();
    }

    public void getGradeMap() {
        Map<String, Student> students = new TreeMap<>();
    }

}
