
package pkg251_project_group_one;

import java.util.ArrayList;

public class Leader extends User {

    //attributes
    static ArrayList<Event> eventsAdded;

//constructor
    public Leader(String userName, String password, String lastName, String eamil) {
        super(userName, password, lastName, eamil);
        
    }
    
    //getters
    public static ArrayList<Event> getEvents() {
        return eventsAdded;
    }

   //setters
    public static void setEvents(ArrayList<Event> eventsAdded) {
        Leader.eventsAdded = eventsAdded;
    }
   
  
}
