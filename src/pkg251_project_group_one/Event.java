
package pkg251_project_group_one;

import java.util.ArrayList;


public class Event {
    
     //attributes
    private String EventName;
    private  String date;
    private int NumberOfSeats;
     private String descriptionOfEvent;
    static ArrayList<Event> EventsAdded = new ArrayList<>();

    //constructor
    public Event(String EventName, String date, int NumberOfSeats, String descriptionOfEvent) {
        this.EventName = EventName;
        this.date = date;
        this.NumberOfSeats = NumberOfSeats;
        this.descriptionOfEvent = descriptionOfEvent;
    }

    //getters
    public String getEventName() {
        return EventName;
    }

    public String getDate() {
        return date;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public String getDescriptionOfEvent() {
        return descriptionOfEvent;
    }

    public static ArrayList<Event> getEvents() {
        return EventsAdded;
    }
    
  //setters
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNumberOfSeats(int NumberOfSeats) {
        this.NumberOfSeats = NumberOfSeats;
    }

    public void setDescriptionOfEvent(String descriptionOfEvent) {
        this.descriptionOfEvent = descriptionOfEvent;
    }

    public static void setEvents(ArrayList<Event> EventsAdded) {
        Event.EventsAdded = EventsAdded;
    }

  //method: add event 
    public static String addNewEvent(Event newEventAdded) {
        EventsAdded.add(newEventAdded);
        return "Event added to system successfully";
    }
    
    
    
    //method: delete event  
     public static String deleteEvent(String EventName) {
        Event eventDelete = searchEvent(EventName);
        if (EventsAdded.isEmpty()) {
            return "There is no Events in the System";
        } else if (eventDelete != null) {
            EventsAdded.remove(eventDelete);
            return "Event delete from system successfully";
        } else {
            return "Event Not Found";
        }
    }
    
    
    
    //method: search for event
    
    public static Event searchEvent(String search1) {
        for (int i = 0; i < EventsAdded.size(); i++) {
            if (EventsAdded.get(i).EventName.equals(search1)) {
                return EventsAdded.get(i);}}
        return null;}
    
    
    
    
    
     //method: show avaliable event







}