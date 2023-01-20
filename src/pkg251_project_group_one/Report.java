
package pkg251_project_group_one;

import java.time.LocalTime;
import java.util.ArrayList;


public class Report {
   //attributes
        private  LocalTime reportdate;
       private int reportNmae;
      static ArrayList<Report> reportsFiles = new ArrayList<>();
    
    
    //constructor
      public Report(LocalTime reportdate, int reportNmae) {
        this.reportdate = reportdate;
        this.reportNmae = reportNmae;
    }
    
    //getters
    public LocalTime getReportdate() {
        return reportdate;
    }

    public int getReportNmae() {
        return reportNmae;
    }

    public static ArrayList<Report> getReportFiles() {
        return reportsFiles;
    }
   //setters
    public void setReportdate(LocalTime reportdate) {
        this.reportdate = reportdate;
    }

    public void setReportNmae(int reportNmae) {
        this.reportNmae = reportNmae;
    }

    public static void setReportFiles(ArrayList<Report> reportsFiles) {
        Report.reportsFiles = reportsFiles;
    }

  

    
}
  
