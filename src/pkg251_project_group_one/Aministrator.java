package pkg251_project_group_one;

import java.util.ArrayList;

public class Aministrator extends User {

    //attributes
    static ArrayList<Report> reportsFiles;

    //constructor

    public Aministrator(String userName, String password, String firstName, String middleName, String lastName, String eamil) {
        super(userName, password, firstName, middleName, lastName, eamil);
    }
   

    //setters
    public static void setReportsFiles(ArrayList<Report> reportsFiles) {
        Aministrator.reportsFiles = reportsFiles;}
    

    //getters
    public static ArrayList<Report> getReportsFiles() {
        return reportsFiles;
    }
}
