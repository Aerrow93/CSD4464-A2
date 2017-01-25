/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.a2;

import java.util.Objects;
import org.json.simple.JSONObject;

/**
 *
 * @author c0656308
 */
public class Student {

    String name;
    String id;
    String gender;
    double grade;

    /**
     * No-arg Constructor, sets this.VARIABLES to null/zero
     */
    public Student() {
        this.name = "";
        this.id = "";
        this.gender = "";
        this.grade = 0;
    }

    /**
     * Constructor, taking inputed values and assigning them to this.VARIABLES
     *
     * @param name
     * @param id
     * @param gender
     * @param grade
     */
    public Student(String name, String id, String gender, double grade) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }

    /**
     * Gets value of this.name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets value of this.name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets value of this.id
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets value of this.id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets value of this.gender
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets value of this.gender
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets value of this.grade
     *
     * @return grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * Sets value of this.grade
     *
     * @param grade
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    /**
     * Outputs values into a JSON file
     *
     * @return JSON
     */
    @Override
    public String toString() {
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("id", id);
        json.put("gender", gender);
        json.put("grade", grade);
        return json.toJSONString();
    }

    /**
     * Checking to see if Student object has matching id values
     *
     * @param obj student values
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (Double.doubleToLongBits(this.grade) != Double.doubleToLongBits(other.grade)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        return true;
    }

}
