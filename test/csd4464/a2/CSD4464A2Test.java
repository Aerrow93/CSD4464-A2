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

    public class StudentImpl extends Student {
    }

}
