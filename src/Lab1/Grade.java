/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author knc
 */
public class Grade {
    double lab;
    double ProgressTest;
    double FinalExam;
    Student stu;
    Subject sub;
    

    public Grade() {
    }

    Grade(double lab, double ProgressTest, double FinalExam) {
        this.lab = lab;
        this.ProgressTest = ProgressTest;
        this.FinalExam = FinalExam;
    }

    public float average(){
        return (float) (0.3*lab + 0.2*ProgressTest+0.5*FinalExam);
    }
    public Grade(double lab, double ProgressTest, double FinalExam, Student stu, Subject sub) {
        this.lab = lab;
        this.ProgressTest = ProgressTest;
        this.FinalExam = FinalExam;
        this.stu = stu;
        this.sub = sub;
    }



    public double getLab() {
        return lab;
    }

    public void setLab(double lab) {
        this.lab = lab;
    }

    public double getProgressTest() {
        return ProgressTest;
    }

    public void setProgressTest(double ProgressTest) {
        this.ProgressTest = ProgressTest;
    }

    public double getFinalExam() {
        return FinalExam;
    }

    public void setFinalExam(double FinalExam) {
        this.FinalExam = FinalExam;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public Subject getSub() {
        return sub;
    }

    public void setSub(Subject sub) {
        this.sub = sub;
    }
    

    @Override
    public String toString() {
        return "Grade{" + "lab=" + lab + ", ProgressTest=" + ProgressTest + ", FinalExam=" + FinalExam + '}';
    }


    
}
