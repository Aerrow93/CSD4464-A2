/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.a2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kelsey Bruin
 */
public class Course {

    List<Student> students = new ArrayList<Student>();

    public Course() {
    }

    public Course(List<Student> students) {
        this.students = students;
    }

    public void add(List<Student> students) {
        this.students.add(students);
    }

    
    
    
    
    
    
    
    
    
    
    public void insert(List<Student> students, int i){
        
    }
}
