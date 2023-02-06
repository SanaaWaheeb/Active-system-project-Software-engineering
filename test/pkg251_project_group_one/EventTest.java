/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251_project_group_one;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author DELL
 */
public class EventTest {
    
    public EventTest() {
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
     * Test of getEventName method, of class Event.
     */
    //Sanaa
    @Test 
    //Sanaa
    public void testGetEventName() {
        System.out.println("getEventName");
        Event instance = new Event("Cake design workshop", "02:02:23", 25, "Workshop about design cake. Held in 145G in FCIT ");
        String expResult = "Cake design workshop";
        String result = instance.getEventName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDate method, of class Event.
     */
    
    @Test
    //Ftoon
    public void testGetDate() {
        System.out.println("getDate");
        Event instance =new Event("Crochet workshop", "02:07:23", 20, "Workshop about learning the basic Crochet ");
        String expResult = "02:07:23";
        String result = instance.getDate();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNumberOfSeats method, of class Event.
     */
    @Test
    //Waad
    public void testGetNumberOfSeats() {
        System.out.println("getNumberOfSeats");
        Event instance =new Event("protect your information ", "04:05:23", 30, " Lecture about how to be safe while doing online meetings ");
        int expResult = 30;
        int result = instance.getNumberOfSeats();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDescriptionOfEvent method, of class Event.
     */
    @Test
    //Taghreed
    public void testGetDescriptionOfEvent() {
        System.out.println("getDescriptionOfEvent");
        Event instance = new Event("How to create a database", "03:08:23", 20, " A lab teaches the basics and methods of creating DB in a correct way ");;
        String expResult = " A lab teaches the basics and methods of creating DB in a correct way ";
        String result = instance.getDescriptionOfEvent();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEvents method, of class Event.
     */
    @Test
    ////
    @Ignore
    public void testGetEvents() {
        System.out.println("getEvents");
        ArrayList<Event> expResult = null;
        ArrayList<Event> result = Event.getEvents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEventName method, of class Event.
     */
   
    @Test
    //Sanaa
    public void testSetEventName() {
        System.out.println("setEventName");
        String EventName = "C++ course";
        Event instance = new Event("Java course", "03:02:23", 15, "C++ workshop that let you learn about basic java lessons");
        instance.setEventName(EventName);
          String expResult = "C++ course";
        String result = instance.getEventName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class Event.
     */
    @Test
    //ftoon
    public void testSetDate() {
        System.out.println("setDate");
        String date = "13:03:23";
        Event instance = new Event("Graphics design","15:03:23",20,"Graphics design is a visual workout that is designed to increase your creativity");
        instance.setDate(date);
         String expResult = "13:03:23";
         String result = instance.getDate();
         assertEquals(expResult, result);
   
    }

    /**
     * Test of setNumberOfSeats method, of class Event.
     */
    @Test
    //Waad
    public void testSetNumberOfSeats() {
        System.out.println("setNumberOfSeats");
        int NumberOfSeats = 20;
        Event instance = new Event("3D drawing course", "10:07:23", 15, " A course that let you learn about fundamentals of 3D drawing ");
        instance.setNumberOfSeats(NumberOfSeats);
         int  expResult = 20;
         int result = instance.getNumberOfSeats();
          assertEquals(expResult, result);
    }

    /**
     * Test of setDescriptionOfEvent method, of class Event.
     */
    @Test
    //Taghreed
    public void testSetDescriptionOfEvent() {
        System.out.println("setDescriptionOfEvent");
        String descriptionOfEvent = " Lecture on an overview of IT disciplines in a simplified manner ";
        Event instance = new Event("introduction to IT", "20:10:23", 35, " Lecture on an overview of CS disciplines in a simplified manner ");
        instance.setDescriptionOfEvent(descriptionOfEvent);
        String expResult = " Lecture on an overview of IT disciplines in a simplified manner ";
        String result = instance.getDescriptionOfEvent();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEvents method, of class Event.
     */
    @Test
    ///
    @Ignore
    public void testSetEvents() {
        System.out.println("setEvents");
        ArrayList<Event> EventsAdded = null;
        Event.setEvents(EventsAdded);
      
    }

    /**
     * Test of addNewEvent method, of class Event.
     */
    @Test
    //Sanaa
    public void testAddNewEvent() {
        System.out.println("addNewEvent");
        Event newEventAdded = new Event("Java course", "05:03:23", 25, "Become a Java Programming Expert With Best Java Programming Course");
        String expResult = "Event added to system successfully";
        String result = Event.addNewEvent(newEventAdded);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of deleteEvent method, of class Event.
     */
    @Test
    //Taghreed
    public void testDeleteEvent() {
        System.out.println("deleteEvent");
        String EventName = "";
        String expResult = "";
        String result = Event.deleteEvent(EventName);
        assertEquals(expResult, result);

    }

    /**
     * Test of searchEvent method, of class Event.
     */
    @Test
    //Waad
    public void testSearchEvent() {
        System.out.println("searchEvent");
        String search1 = "";
        Event expResult = null;
        Event result = Event.searchEvent(search1);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of showEvent method, of class Event.
     */
    @Test
    //Ftoon
    public void testShowEvent() {
        System.out.println("showEvent");
        Event.showEvent();
       
    }
    
}
