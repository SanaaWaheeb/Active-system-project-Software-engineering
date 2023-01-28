/*
251 project
 */
package pkg251_project_group_one;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Create new leaders for the system
        Leader leaderOfSocialCommittees = new Leader("hanaa", "251_beautiful", "dr. Hanaa", "Ahmed", "Alamodi", "hanaa@stu.kau.edu.sa");
        Leader leaderOfIslamicCommittees = new Leader("fatama", "251_great", "dr. Fatama", "Mohammed", "Alrarhi", "Fatama@stu.kau.edu.sa");
        Leader leaderOfCulturalCommittees = new Leader("doaa", "251_fun", "dr. Doaa", "Tamer", "Alhashdi", "doaa@stu.kau.edu.sa");
        Leader leaderOfSportCommittees = new Leader("suaad", "251_nice", "dr. Suaad", "Ahmed", "Alshmrani", "suaad@stu.kau.edu.sa");

        //Print user interface on the screan 
        System.out.println("*****************************************************************************************************************");
        System.out.println("                                           FCIT Activities system                                         ");
        System.out.println("*****************************************************************************************************************");
        System.out.println(" 1. Leader");
        System.out.println(" 2. Student");
        System.out.println(" 3. Administrator");
        System.out.println("******************************************************************************************************************");
        System.out.print("Enter '1' if you are Leader, '2' if you are Student, '3'  if you are Administrator: ");

        //Create scanner and Read user choice
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (choice == 1) { //if leader
            System.out.print("Enter User Name: "); // leader username
            String username = input.next();
            System.out.print("Enter Password: "); // leader password
            String password = input.next();
// check if name and password is true 
            if (username.equals(leaderOfSocialCommittees.getUserName()) && (password.endsWith(leaderOfSocialCommittees.getPassword())) || 
                username.equals(leaderOfIslamicCommittees.getUserName()) && (password.endsWith(leaderOfIslamicCommittees.getPassword()))||
                username.equals(leaderOfCulturalCommittees.getUserName()) && (password.endsWith(leaderOfCulturalCommittees.getPassword()))||
                username.equals(leaderOfSportCommittees.getUserName()) && (password.endsWith(leaderOfSportCommittees.getPassword()))) {
                int leaderChoice = 0;
                while (leaderChoice != 5) {
                   // show services of  the leader 
        System.out.println("*****************************************************************************************************************");
        System.out.println("                                          FCIT Activities system                                                 ");
        System.out.println("*****************************************************************************************************************");
        System.out.println("1. Add Event to System");
        System.out.println("2. Delete Event From System");
        System.out.println("3. Show Events In System");
        System.out.println("4. Search For Event");
        System.out.println("5. Logout");
        System.out.println("******************************************************************************************************************");
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
                        //delete event
                          
                      
                        case 3:
                        //show event
                           
                         
                        case 4:
                        //Search for Event
                      
                            default:
                            break;}}
            
            
            
            
            
            
            
            
            
            
        } else {  //incorrect username or password
            System.out.println("Your UserName or Password are wrong, Try Again");
        }
      }
        
    } 
    
}
