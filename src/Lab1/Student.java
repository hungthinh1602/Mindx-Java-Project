package Lab1;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author knc
 */
public class Student {
    String StudentID,FirstName,LastName,gender;
    boolean canDelete;
    String email,phone;
    String DOB;

    public Student(String StudentID, String FirstName, String LastName, String gender, String email, String phone, String DOB) {
        this.StudentID = StudentID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.DOB = DOB;
    }

    public Student() {
    }




    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    
    public String toString() {
        return  "StudentID=" + StudentID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", DOB=" + DOB ;
    }
    
    
    
}
