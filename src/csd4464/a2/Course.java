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
     * Outputs values into a JSON String
     *
     * @return JSON String
     */
    @Override
    public String toString() {
        return "Course{" + "students=" + students + '}';
    }

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
    public void get(int position) {
        this.students = students;
    }

    /**
     * Gets value of this.student list id
     *
     * @param id
     */
    public void get(String id) {
        this.students = students;
    }

    /**
     * Gets the value of all this.student list values
     */
    public void getAll() {
        this.students = students;
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
        Map<String, Set<Student>> students = new HashMap<>();
        return students;
    }

}
