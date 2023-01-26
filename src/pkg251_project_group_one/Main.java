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

        } else {  //incorrect username or password
            System.out.println("Your UserName or Password are wrong, Try Again");
        }
    }
}
