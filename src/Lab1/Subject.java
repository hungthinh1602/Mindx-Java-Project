/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author knc
 */
package Lab1;
public class Subject {
    String subID;
    String subName;
    String credit;

    public Subject() {
    }

    public Subject(String subID, String subName, String credit) {
        this.subID = subID;
        this.subName = subName;
        this.credit = credit;
    }

    public String getSubID() {
        return subID;
    }

    public void setSubID(String subID) {
        this.subID = subID;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Subject{" + "subID=" + subID + ", subName=" + subName + ", credit=" + credit + '}';
    }



    
}
