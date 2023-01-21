
package pkg251_project_group_one;


public class User {
      //attributes
     private String userName;
     private String password;
     private String firstName;
     private String middleName;
     private String lastName;
     private String eamil;

     //constructor
    public User(String userName, String password, String firstName, String middleName, String lastName, String eamil) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.eamil = eamil;
    }
     
       
    //getters
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEamil() {
        return eamil;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }
    
    
   //setter
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    
}
