/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package csd4464.a2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0538434
 */
public class CourseTest {
    
    public List<Student> defaultStudentList;
    
    public CourseTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        defaultStudentList = new ArrayList<>();
        defaultStudentList.add(new Student("James", "S1365", "Male", 65));
        defaultStudentList.add(new Student("Joan", "S9846", "Female", 87));
        defaultStudentList.add(new Student("Jackie", "S1493", "Female", 54));
        defaultStudentList.add(new Student("Josh", "S5997", "Male", 94));
        defaultStudentList.add(new Student("John", "S9737", "Male", 83));
        defaultStudentList.add(new Student("Jacob", "S9873", "Male", 68));
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void noArgsConstructorGetAllReturnsEmptyList() {
        //Create a course object
        //Capture output of getAll() method
        //Compare to empty list
        Course c = new Course();
        List<Student> emptyList = new ArrayList<>();
        assertEquals(c.getAll(), emptyList);
    }
    
    @Test
    public void listConstructorGetAllReturnsList() {
        //Create a course object
        //Capture output of getAll() method
        //Compare to list provided
        Course c = new Course(defaultStudentList);
        List<Student> expectedList = new ArrayList<>();
        expectedList = defaultStudentList;
        assertEquals(c.getAll(), expectedList);
    }
    
    @Test
    public void noArgsConstructorAddThenGetAllReturnsAdd() {
        //Create object
        //Add a student
        //Capture output of getAll() method
        //Compare to student added
        Course c = new Course();
        c.add(defaultStudentList.get(2));
        List<Student> expectedList = new ArrayList<>();
        expectedList.add(defaultStudentList.get(2));
        assertEquals(c.getAll(), expectedList);
    }
    
    @Test
    public void removeStudentFromCourseShouldRemoveStudent() {
        //Compare original list with list with removed student
        Course c = new Course(defaultStudentList);
        List<Student> expectedList = new ArrayList<>();
        expectedList = defaultStudentList;
        if (expectedList.remove(new Student("John", "S9737", "Male", 83))) {
            c.remove(new Student("John", "S9737", "Male", 83));
            assertEquals(c.getAll(), expectedList);
        }
        else
            fail("The expected list didn't have the 'John' student element? Tell Matt");
    }
    
    @Test
    public void removeStudentByIdFromCourseShouldRemoveStudent() {
        //Compare original list with list with removed student
        Course c = new Course(defaultStudentList);
        List<Student> expectedList = new ArrayList<>();
        expectedList = defaultStudentList;
        if (expectedList.remove(new Student("John", "S9737", "Male", 83))) {
            c.remove("S9737");
            assertEquals(c.getAll(), expectedList);
        }
        else
            fail("The expected list didn't have the 'S9737' ID? Tell Matt");
    }
    
    @Test
    public void removeStudentByListIndexFromCourseShouldRemoveStudent() {
        //Compare original list with list with removed student
        Course c = new Course(defaultStudentList);
        List<Student> expectedList = new ArrayList<>();
        expectedList = defaultStudentList;
        expectedList.remove(2);
        c.remove(2);
        assertEquals(c.getAll(), expectedList);
    }
    
    @Test
    public void insertStudentAtIndexShouldInsertStudent() {
        Course c = new Course(defaultStudentList);
        List<Student> expectedList = new LinkedList<>();
        expectedList = defaultStudentList;
        c.insert(new Student("Judy", "S1328", "Female", 73), 2);
        expectedList.add(2, new Student("Judy", "S1328", "Female", 73));
        assertEquals(c.getAll(), expectedList);
    }
    
    @Test
    public void getStudentIdReturnsStudentData() {
        Course c = new Course(defaultStudentList);
        Student expectedStudent = defaultStudentList.get(0); //Returns James
        assertEquals(c.get("S1365"), expectedStudent);
    }
    
    @Test
    public void invalidStudentIdReturnsNull() {
        Course c = new Course(defaultStudentList);
        assertNull(c.get("C13651"));
    }
    
    @Test
    public void getStudentByIndexReturnsStudentData() {
        Course c = new Course(defaultStudentList);
        Student expectedStudent = defaultStudentList.get(3); //Returns Josh
        assertEquals(c.get(3), expectedStudent);
    }
    
    @Test
    public void invalidStudentIndexAboveSizeReturnsNull() {
        Course c = new Course(defaultStudentList);
        assertNull(c.get(8));
    }
    
    @Test
    public void invalidStudentIndexBelowZeroReturnsNull() {
        Course c = new Course(defaultStudentList);
        assertNull(c.get(-4));
    }
    
    @Test
    public void equalsNotCourseObjectReturnsFalse() {
        Course c = new Course(defaultStudentList);
        assertEquals(c.equals("Banana Stand"), false);
    }
    
    @Test
    public void equalsMatchesAndReturnsTrue() {
        Course c = new Course(defaultStudentList);
        Course sameCourse = new Course(defaultStudentList);
        assertEquals(c.equals(sameCourse), true);
    }
    
    @Test
    public void equalsIsObjectButNotEqualReturnsFalse() {
        Course c = new Course(defaultStudentList);
        Course differentCourse = new Course();
        differentCourse.add(new Student("Kim", "S7838", "Female", 87));
        differentCourse.add(new Student("Kyle", "S1347", "Male", 64));
        differentCourse.add(new Student("Katie", "S1282", "Female", 73));
        assertEquals(c.equals(differentCourse), false);
    }
    
    @Test
    public void toStringReturnsJSONArray() {
        Course c = new Course(defaultStudentList);
        JSONArray expectedJSON = new JSONArray();
        expectedJSON.addAll(defaultStudentList);
        assertEquals(c.toString(), expectedJSON.toString());
    }
    
    @Test
    public void getAllByGenderReturnsStudentsOfThatGender() {
        Course c = new Course(defaultStudentList);
        Course expectedList = new Course();
        for (Student s : defaultStudentList) {
            if (s.gender == "Male") {
                expectedList.add(s);
            }
        }
        assertEquals(c.getAllByGender("Male"), expectedList);
    }
    
    @Test
    public void getGradeMapReturnsLetterGrades() {
        Course c = new Course(defaultStudentList);
        Map letterMap = new HashMap();
        Set<Student> studentHolder;
        String letterGrade;
        for (Student s : defaultStudentList) {
            studentHolder = new HashSet<Student>();
            if (studentHolder.isEmpty())
                studentHolder.add(s);
            else
                fail("studentHolder is not empty? Tell Matt.");
            
            if (s.grade >= 97){
                letterGrade = "A+";
            }
            else if (s.grade >= 94){
                letterGrade = "A";
            }
            else if (s.grade >= 90){
                letterGrade = "A-";
            }
            else if (s.grade >= 87){
                letterGrade = "B+";
            }
            else if (s.grade >= 84){
                letterGrade = "B";
            }
            else if (s.grade >= 80){
                letterGrade = "B-";
            }
            else if (s.grade >= 77){
                letterGrade = "C+";
            }
            else if (s.grade >= 74){
                letterGrade = "C";
            }
            else if (s.grade >= 70){
                letterGrade = "C-";
            }
            else if (s.grade >= 67){
                letterGrade = "D+";
            }
            else if (s.grade >= 64){
                letterGrade = "D";
            }
            else if (s.grade >= 60){
                letterGrade = "D-";
            }
            else{
                letterGrade = "F";
            }
            studentHolder.add((Student)letterMap.get(letterGrade));
            letterMap.put(letterGrade, studentHolder);
        }
        assertEquals(c.getGradeMap(), letterMap);
    }
    
    
}

