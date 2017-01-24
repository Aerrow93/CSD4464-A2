/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.a2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
import org.junit.Test;

/**
 *
 * @author c0600299
 */
public class CSD4464A2Test {

    public CSD4464A2Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CSD4464A2.
     *
     * @throws org.json.simple.parser.ParseException
     * @Test public void testMain() { System.out.println("main"); String[] args
     * = null; CSD4464A2.main(args); // TODO review the generated test code and
     * remove the default call to fail. fail("The test case is a prototype."); }
     */
    @Test
    public void testToString() {
        try {
            Student instance = new StudentImpl();
            instance.setId("c0123456");
            instance.setName("Bill Smith");
            instance.setGender("male");
            instance.setGrade(89.3);
            JSONObject expResult = (JSONObject) new JSONParser().parse("{ \"name\" : \"Bill Smith\", \"id\" : \"c0123456\", \"gender\" : \"male\", \"grade\" : 89.3 }");
            JSONObject result = (JSONObject) new JSONParser().parse(instance.toString());
            assertEquals(expResult, result);
        } catch (ParseException ex) {
            fail("One of the JSON Objects is invalid JSON. Go to jsonlint.com to find out why.");
        }

    }

    @Test
    public void testEqualsStudent() {
        // Object obj = null;
        StudentImpl instance1 = new StudentImpl();
        instance1.setId("C0123456");
        instance1.setName("Bob");
        StudentImpl instance2 = new StudentImpl();
        instance2.setId("C0123456");
        instance2.setName("Bob");
        boolean expResult = true;
        boolean result = instance1.equals(instance2);
        assertEquals(expResult, result);
    }

    @Test
    public void testNotEqualsStudent() {
        Object obj = null;
        StudentImpl instance1 = new StudentImpl();
        instance1.setId("C0654321");
        instance1.setName("Bob");
        StudentImpl instance2 = new StudentImpl();
        instance1.setId("C0123456");
        instance2.setName("Bob");
        boolean expResult = false;
        boolean result = instance1.equals(instance2);
        assertEquals(expResult, result);
    }

    @Test
    public void testNotNameEqualsStudent() {
        Object obj = null;
        StudentImpl instance1 = new StudentImpl();
        instance1.setId("C0123456");
        instance1.setName("Jim");
        StudentImpl instance2 = new StudentImpl();
        instance1.setId("C0123456");
        instance2.setName("Bob");
        boolean expResult = false;
        boolean result = instance1.equals(instance2);
        assertEquals(expResult, result);
    }

    @Test
    public void testNotAllEqualsStudent() {
        Object obj = null;
        StudentImpl instance1 = new StudentImpl();
        instance1.setId("C0645321");
        instance1.setName("Jim");
        StudentImpl instance2 = new StudentImpl();
        instance1.setId("C0123456");
        instance2.setName("Bob");
        boolean expResult = false;
        boolean result = instance1.equals(instance2);
        assertEquals(expResult, result);
    }

    @Test
    public void testNonObject() {
        Object obj = null;

    }

    @Test
    public void testFullConstructor() {
        Object obj = null;
        StudentImpl instance1 = new StudentImpl();
        instance1.getId();
        instance1.getName();
        instance1.getGender();
        instance1.getGrade();
        StudentImpl instance2 = new StudentImpl();
        instance2.getId();
        instance2.getName();
        instance2.getGender();
        instance2.getGrade();
        boolean expResult = true;
        boolean result = instance1.equals(instance2);
        assertEquals(expResult, result);

    }

    @Test
    public void testNoConstructor() {
        Object obj = null;
        StudentImpl instance1 = new StudentImpl();
        instance1.getId();
        instance1.getName();
        instance1.getGender();
        instance1.getGrade();
        StudentImpl instance2 = new StudentImpl();
        instance2.setId("");
        instance2.setName("");
        instance2.setGender("");
        instance2.setGrade(0);
        boolean expResult = true;
        boolean result = instance1.equals(instance2);
        assertEquals(expResult, result);

    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        String id = "c0123456";
        String name = "Bill Smith";
        String gender = "male";
        double grade = 89.3;
        Student instance = new Student(name,id,gender,grade);
        String expResult = "Bill Smith";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetId() {
        System.out.println("getId");
        String id = "c0123456";
        String name = "Bill Smith";
        String gender = "male";
        double grade = 89.3;
        Student instance = new Student(name,id,gender,grade);
        String expResult = "c0123456";
        String result = instance.getId();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testGetGender() {
        System.out.println("getGender");
        String id = "c0123456";
        String name = "Bill Smith";
        String gender = "male";
        double grade = 89.3;
        Student instance = new Student(name,id,gender,grade);
        String expResult = "male";
        String result = instance.getGender();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        String id = "c0123456";
        String name = "Bill Smith";
        String gender = "male";
        double grade = 89.3;
        Student instance = new Student(name,id,gender,grade);
        double expResult = 89.3;
        double result = instance.getGrade();
        assertEquals(expResult, result,0.2);
    }
    
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Bob";
        Student instance = new Student();
        instance.setName(name);
        String result = instance.getName();
        assertEquals(name, result);
    }
    
     @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "c0123456";
        Student instance = new Student();
        instance.setId(id);
        String result = instance.getId();
        assertEquals(id, result);
    }
    
     @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "male";
        Student instance = new Student();
        instance.setGender(gender);
        String result = instance.getGender();
        assertEquals(gender, result);
    }
    
     @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        double grade = 89.3;
        Student instance = new Student();
        instance.setGrade(grade);
        double result = instance.getGrade();
        assertEquals(grade, result,0.02);
    }

    public class StudentImpl extends Student {
    }

}
