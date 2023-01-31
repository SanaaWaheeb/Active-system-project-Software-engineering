/*
251 project
 */
package pkg251_project_group_one;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Create new object for leaders for the system
        Leader leaderOfSocialCommittees = new Leader("hanaa", "251_beautiful", "dr. Hanaa", "Ahmed", "Alamodi", "hanaa@stu.kau.edu.sa");
        Leader leaderOfIslamicCommittees = new Leader("fatama", "251_great", "dr. Fatama", "Mohammed", "Alrarhi", "Fatama@stu.kau.edu.sa");
        Leader leaderOfCulturalCommittees = new Leader("doaa", "251_fun", "dr. Doaa", "Tamer", "Alhashdi", "doaa@stu.kau.edu.sa");
        Leader leaderOfSportCommittees = new Leader("suaad", "251_nice", "dr. Suaad", "Ahmed", "Alshmrani", "suaad@stu.kau.edu.sa");

        //Print user interface on the screan 
        System.out.println("********************************************************************************************************************");
        System.out.println("                                              FCIT Activities system                                                ");
        System.out.println("********************************************************************************************************************");
        System.out.println(" 1. Leader..........................................................................................................");
        System.out.println(" 2. Student.........................................................................................................");
        System.out.println(" 3. Administrator...................................................................................................");
        System.out.println("********************************************************************************************************************");
        System.out.print("Enter '1' if you are Leader, '2' if you are Student, '3'  if you are Administrator: ");

        //Create scanner and Read user choice
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (choice == 1) { //if leader
            System.out.print("Enter User Name: "); // leader username
            String username = input.next();
            System.out.print("Enter Password: "); // leader password
            String password = input.next();
            // check if name and password are true 
            if (username.equals(leaderOfSocialCommittees.getUserName()) && (password.endsWith(leaderOfSocialCommittees.getPassword())) || 
                username.equals(leaderOfIslamicCommittees.getUserName()) && (password.endsWith(leaderOfIslamicCommittees.getPassword()))||
                username.equals(leaderOfCulturalCommittees.getUserName()) && (password.endsWith(leaderOfCulturalCommittees.getPassword()))||
                username.equals(leaderOfSportCommittees.getUserName()) && (password.endsWith(leaderOfSportCommittees.getPassword()))) {
                int leaderChoice = 0;
                while (leaderChoice != 5) {
                   // show services of  the leader 
        System.out.println("*****************************************************************************************************************");
        System.out.println("                                          FCIT Activities system                                                 ");
        System.out.println("******************************************************************************************************************");
        System.out.println("1. Add Event to System............................................................................................");
        System.out.println("2. Delete Event From System........................................................................................");
        System.out.println("3. Show Events In System...........................................................................................");
        System.out.println("4. Search For Event.................................................................................................");
        System.out.println("5. Logout...........................................................................................................");
        System.out.println("********************************************************************************************************************");
        System.out.print("Enter '1' to Add Event, '2' to Delete Event, '3'  Show Events, '4' Search For Event, '5' to Exit from System:  ");
        
                    leaderChoice = input.nextInt();
                    switch (leaderChoice) {
                        
                        case 1:
                        //add event
                            System.out.print("Enter Event Name: ");
                            String eventName = input.next();
                            System.out.print("Enter Date of Event in format 'DD:MM:YY': ");
                            String dateOfEvent = input.next();
                            System.out.print("Enter Number Of Seats: ");
                            int numberOfSeats = input.nextInt();
                            System.out.print("Enter Description Of Event: ");
                            String descriptionOfEvent = input.next();
                            Event eventAdded = new Event(eventName,dateOfEvent,numberOfSeats,descriptionOfEvent);
                            // add event to system 
                            System.out.println(Event.addNewEvent(eventAdded));
                            break;
                        
                        case 2:
                        //we call method delete event
                            System.out.print("Enter Event Name to delete it: ");
                            System.out.println(Event.deleteEvent(input.next()));
                            break;
                        case 3:
                        //we call method show event
                           Event.showEvent();
                            break;
                        case 4:
                        //Search for Event
                            System.out.print("Enter Event name: ");
                            String nameOfEvent = input.next();
                            //search about event using name of event
                            Event eventsearched = Event.searchEvent(nameOfEvent);
                            //if the event dose not exit 
                            if (eventsearched == null) {
                                System.out.println("This Event Does Not Upload In System");
                            }
                            // print the information about existing Events in the system
                            else 
                            {System.out.println("*************************************************************************************************************");
                             System.out.println("                                          FCIT Activities system                                             ");
                             System.out.println("*************************************************************************************************************");
                             System.out.println( "The Name Of Event is: " + eventsearched.getEventName() + ", Number of seats  are: "
                                         + eventsearched.getNumberOfSeats() +", The Event Date is: " + eventsearched.getDate() 
                                         + ", The Description Of Event is: "+eventsearched.getDescriptionOfEvent());
                             System.out.println("**************************************************************************************************************");}
                            break;
                            default:
                            break;}} 
        } else {  //incorrect username or password
            System.out.println("Your UserName or Password are wrong, Try Again");
        }
      }
        
    } 
    
}
