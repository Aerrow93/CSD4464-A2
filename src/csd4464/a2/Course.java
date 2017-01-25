/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.a2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Kelsey Bruin
 */
public class Course {

    List<Student> students = new ArrayList<Student>();

    /**
     * No-arg Constructor
     */
    public Course() {
    }

    /**
     * Constructor, taking inputed values and assigning them to this.VARIABLES
     *
     * @param students
     */
    public Course(List<Student> students) {
        this.students = students;
    }

    /**
     * Sets values to this.students
     *
     * @param students
     */
    public void add(Student students) {
        this.students.add(students);
    }

    /**
     * Removing student parameter from this.student list
     *
     * @param students
     */
    public void remove(Student students) {
        this.students.remove(students);
    }

    /**
     * Removing id parameter from this.student list
     *
     * @param id
     */
    public void remove(String id) {
        this.students.remove(id);
    }

    /**
     * Removing position parameter from this.student list
     *
     * @param position
     */
    public void remove(int position) {
        this.students.remove(position);
    }

    /**
     * Inserting student into specified position parameter into this.student
     * list
     *
     * @param students
     * @param position
     */
    public void insert(Student students, int position) {
        this.students.add(position, students);
    }

    /**
     * Gets value of this.student list position
     *
     * @param position
     */
    public Student get(int position) {
        //Additional logic needs to be put in here to prevent 
        // out of bounds exceptions (so it returns null when 
        // position is below zero or above the size of the list
        //MATT see if this is right please
        int len = students.size();
        if (position < 0) {
            return null;
        } else if (position != position) {
            return null;
        } else if (position > len){
            return null;
        }
        return this.students.get(position);
    }

    /**
     * Gets value of this.student list id
     *
     * @param id
     */
    public Student get(String id) {
        Student i = null;
        for (Student s : this.students) {
            if (s.id == id) {
                i = s;
            }
        }
        return i;
    }

    /**
     * Gets the value of all this.student list values
     */
    public List<Student> getAll() {
        return this.students;
    }

    /**
     * Checking to see if Student list contains the searched object
     *
     * @param obj
     * @return boolean
     */
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

    /**
     * Returns a set of all students by gender
     *
     * @param gender
     * @return students set
     */
    public HashSet<Student> getAllByGender(String gender) {
        HashSet<Student> students = new HashSet<>();
        return students;
    }

    /**
     * Returns a map of all students by gender
     *
     * @return students map
     */
    public Map<String, Set<Student>> getGradeMap() {
        Map<String, Set<Student>> studentsMap = new HashMap<>();
        return studentsMap;
    }

    /**
     * Outputs values into a JSON String
     *
     * @return JSON String
     */
    //MATT This was originally typed at the top of the class
    @Override
    public String toString() {
        return "Course{" + "students=" + students + '}';
    }
}
