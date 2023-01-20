
package pkg251_project_group_one;

import java.util.ArrayList;


public class EventRegistration {
   
    //attributes
    ArrayList<Event> Events_avalible = new ArrayList<>();
    ArrayList<Integer> numberOfSeats = new ArrayList<>();
   

//constructor
 public EventRegistration() {
    }


//getters
    public ArrayList<Event> getEvents_avalible() {
        return Events_avalible;
    }

    public ArrayList<Integer> getNumberOfSeats() {
        return numberOfSeats;
    }
    
     //setters
    public void setEvents_avalible(ArrayList<Event> Events_avalible) {
        this.Events_avalible = Events_avalible;
    }

    public void setNumberOfSeats(ArrayList<Integer> numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

   

}   

