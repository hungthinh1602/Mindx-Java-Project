package Lab1;

import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author knc
 */
public class StudentManager {

    public StudentManager() {
        super();
    }

    Scanner sc = new Scanner(System.in);

    public int findStu(String stuID) {
        for (int i = 0; i < stuList.size(); i++) {
            if (stuList.get(i).getStudentID().equals(stuID)) {
                return i;
            }
        }
        return -1;
    }

//*************************************************************************************************************************************************
//*************************************************************************************************************************************************
//*************************************************************************************************************************************************
    ArrayList<Student> stuList = new ArrayList<>();

    public void addNewStudent() {
        String newID, newF, newL, newG, newP;
        boolean check = true;
        String newE = null, DOB;
        boolean validData;
        Scanner sc = new Scanner(System.in);
        System.out.println("**** Enter Student Informstion *****");
        int pos;

        do {
            check = true;
            System.out.println("Input StudentID: ");
            String ID = "^SE\\d{6}|IA\\d{6}";
            newID = sc.nextLine().trim().toUpperCase();
            validData = newID.matches(ID);
            pos = findStu(newID);     
                if (validData == false) {
                    System.out.println("Must be SExxx | IAxxx | SAxx | SBxxx");
                    check = false;
                } else if (newID.equals("")) {
                    check = false;
                    System.out.println("Can not null");
                }
                 if (pos >= 0) {
                System.out.println("This Student ID has been Added Before");
                check = false;
            }
        }while (check == false);

            do {
                check = true;
                System.out.println("First Name: ");
                newF = sc.nextLine();
                if (newF.equals("")) {
                    check = false;
                    System.out.println("Can not null");
                }
            } while (check == false);

            //
            do {
                System.out.println("Last Name: ");
                newL = sc.nextLine();
                if (newL.equals("")) {
                    check = false;
                    System.out.println("Can not null");
                }else{
                    check=true;
                }
            } while (check == false);

            do {
                check = true;
                System.out.println("Gender: "); //M or F
                newG = sc.nextLine().trim().toUpperCase();
                String CheckGender = "^F|M";
                check = newG.matches(CheckGender);
                if (newG.equals("")) {
                    check = false;
                    System.out.println("Can not null");
                } else if (!newG.matches(CheckGender)) {
                    System.out.println("Must F (Female) and M (Male)");
                }
            } while (check == false);

            do {

                check = true;
                System.out.println("DOB : "); // must valid days
                String CheckDay = "(0[1-9]|[12]\\d|3[01])-(0[1-9]|1[012])-([19|20]\\d{3})";
                DOB = sc.nextLine();
                validData = DOB.matches(CheckDay);
                if (DOB.equals("")) {
                    System.out.println("Can not NULL");
                }
                if (validData = false) {
                    System.out.println("Must be dd-mm-yyyy");
                    check = false;
                } else if (!DOB.matches(CheckDay)) {
                    check = false;
                    System.out.println("Invalid day");
                }

            } while (check == false);
//        do {
//            Date d = new Date();
//            System.out.println("DOB: ");
//            DOB = sc.nextLine().trim();
//            long t = toDate(DOB);
//            if (t < 0) {
//                System.out.println("Invalid Date");
//                check=false;
//            }else {
//                d = new Date();
//                check=true;
//            }
//        } while (check==false);

            do {
                check = true;
                System.out.println("Email : ");
                String validEmail = "\\w+@\\w+[.]\\w+";      //Email
                newE = sc.nextLine();
                validData = newE.matches(validEmail);
                if (newE.equals("")) {
                    System.out.println("can not NULL");
                }
                if (validData = false) {
                    System.out.println("must be xxx@xxx.xxx");
                    check = false;
                } else if (!newE.matches(validEmail)) {
                    check = false;
                    System.out.println("Invalid Email");
                }
            } while (check == false);

            do {
                check = true;
                String phone = "\\d{10,11}";
                System.out.println("Phone numbers : ");
                newP = sc.nextLine();
                validData = newP.matches(phone);
                if (newP.equals("")) {
                    check = false;
                    System.out.println("Can not NULL");
                } else if (!newP.matches(phone)) {
                    System.out.println("Phone number must be 10-12 degits!!!");
                    check = false;
                }
            } while (check == false);
            stuList.add(new Student(newID, newF, newL, newG, newE, newP, DOB));
            System.out.println("New Student has been Added!!!");
        }

    

    public void subMenu() {
        boolean check = true, Input = true;
        Vector submnu = new Vector();

        do {
            check = true;
            submnu.add("A- Update Student");
            submnu.add("\nB- Delete Student");
            submnu.add("\nC- Exit");
            submnu.add("\nSubMenu Choice: ");
            System.out.println(submnu);
            String subChoices = "^A|B";
            do {
                Input = true;
                subChoices = sc.nextLine().trim().toUpperCase();
                if (!subChoices.equals("A") & !subChoices.equals("B") & !subChoices.equals("C")) {
                    Input = false;
                    System.out.println("\nYou must Choice A or B to use subMenu");
                }

                if (subChoices.equals("A")) {
                    UpdateStudent();
                    Input = true;
                }
                if (subChoices.equals("B")) {
                    DeleteStudent();
                    Input = true;
                }
                if (subChoices.equals("C")) {
                    Input = true;
                }
            } while (Input == false);

        } while (check == false);

    }

    public void UpdateStudent() {
        String ID, newF, newL, newG, newP;
        boolean check = true, validData = true;
        String newE = null;
        String DOB;
        int pos;

        System.out.println("Input Student ID want to Update: ");
        ID = sc.nextLine().trim().toUpperCase();

        pos = findStu(ID);
        if (pos < 0) {
            System.out.println("ID does not Exit");
        } else {

            do {
                check = true;
                System.out.println("First Name: ");
                newF = sc.nextLine();
                if (newF.equals("")) {
                    check = false;
                    System.out.println("Can not null");
                }
            } while (check == false);

            //
            do {
                System.out.println("Last Name: ");
                newL = sc.nextLine();
                if (newL.equals("")) {
                    check = false;
                    System.out.println("Can not null");
                }
            } while (check == false);

            do {
                check = true;
                System.out.println("Gender: "); //M or F
                newG = sc.nextLine().trim().toUpperCase();
                String CheckGender = "^F|M";
                check = newG.matches(CheckGender);
                if (newG.equals("")) {
                    check = false;
                    System.out.println("Can not null");
                } else if (!newG.matches(CheckGender)) {
                    System.out.println("Must F (Female) and M (Male)");
                }
            } while (check == false);

            do {
                check = true;
                System.out.println("DOB : "); // must valid days
                String CheckDay = "(0[1-9]|[12]\\d|3[01])-(0[1-9]|1[012])-((19\\d{2})|(20\\d{2}))";
                DOB = sc.nextLine();
                validData = DOB.matches(CheckDay);
                if (DOB.equals("")) {
                    System.out.println("Can not NULL");
                }
                if (validData = false) {
                    System.out.println("Must be dd-mm-yyyy");
                    check = false;
                } else if (!DOB.matches(CheckDay)) {
                    check = false;
                    System.out.println("Invalid day");
                }
            } while (check == false);

            do {
                check = true;
                System.out.println("Email : ");
                String validEmail = "^\\w+@\\w+[.]\\w";      //error again
                newE = sc.nextLine();
                validData = newE.matches(validEmail);
                if (newE.equals("")) {
                    System.out.println("can not NULL");
                }
                if (validData = false) {
                    System.out.println("must be xxx@xxx.xxx");
                    check = false;
                } else if (!newE.matches(validEmail)) {
                    check = false;
                    System.out.println("Invalid Email");
                }
            } while (check == false);
            do {
                check = true;
                String phone = "\\d{10,11}";
                System.out.println("Phone numbers : ");
                newP = sc.nextLine();
                validData = newP.matches(phone);
                if (newP.equals("")) {
                    check = false;
                    System.out.println("Can not NULL");
                } else if (!newP.matches(phone)) {
                    System.out.println("Phone number must be 10-12 degits!!!");
                    check = false;
                }

            } while (check == false);
            stuList.set(pos, (new Student(ID, newF, newL, newG, newE, newP, DOB)));
            System.out.println("The Student with ID  " + ID + " has been UPDATED.");

        }

    }

    public void DeleteStudent() {
        int pos;
        String code;
        System.out.println("Input ID want to REMOVE: ");
        code = sc.nextLine().toUpperCase();
        pos = findStu(code);
        if (pos < 0) {
            System.out.println("Student does not exit");
        } else {
            stuList.remove(pos);
            System.out.println("The Student with ID " + code + " has been REMOVED!");
        }
    }

//    public void print() {
//        for (Student x : stuList) {
//            System.out.println(x.toString());
//        }
//    }
//*****************************************************************************************************************************************************
//*****************************************************************************************************************************************************
//*****************************************************************************************************************************************************
    ArrayList<Subject> subList = new ArrayList();

    public int findSub(String subID) {
        for (int i = 0; i < subList.size(); i++) {
            if (subList.get(i).getSubID().equals(subID)) {
                return i;
            }
        }
        return -1;
    }

    public void subjectMenu() {
        boolean check = true, Input = true;
        Vector submnu = new Vector();

        do {
            check = true;
            submnu.add("A- Update Subject");
            submnu.add("\nB- Delete Subject");
            submnu.add("\nC- Exit");
            submnu.add("\nSubMenu Choice: ");
            System.out.println(submnu);
            String subChoices = "^A|B|C";
            do {
                Input = true;
                subChoices = sc.nextLine().trim().toUpperCase();
                if (!subChoices.equals("A") & !subChoices.equals("B")) {
                    Input = false;
                    System.out.println("\nYou must Choice A or B to use subMenu");
                }

                if (subChoices.equals("A")) {
                    updateSubject();
                    Input = true;
                }
                if (subChoices.equals("B")) {
                    DeleteSubject();
                    Input = true;
                }
                if (subChoices.equals("C")) {
                    check = true;
                }
            } while (Input == false);

        } while (check == false);
    }

    public void addNewSubject() {
        String subID;
        String subName;
        String credit;
        int pos;
        boolean check = true;

        System.out.println("***** ADD New Subject *****");

        do {
            System.out.println("Subject ID: ");
            subID = sc.nextLine().trim().toUpperCase();
            pos = findSub(subID);
            if (pos >= 0) {
                System.out.println("This Subject ID has been Added Before");
                check = false;
            } else {
                check = true;
            }
        } while (check == false);

        //**********************************
        do {
            System.out.println("Subject Name: ");
            subName = sc.nextLine().trim().toUpperCase();
            if (subName.equals("")) {
                System.out.println("Subject Name can not NULL");
                check = false;
            } else {
                check = true;
            }
        } while (check == false);

        //**********************************
        String validCredit = "[0-9]";
        System.out.println("Subject Credit: ");
        do {
            credit = sc.nextLine();
            if (!credit.matches(validCredit)) {
                System.out.println("Must be Integer");
                check = false;
            } else {
                check = true;
            }
        } while (check == false);

        System.out.println("Add new Subject Successfully");
        subList.add(new Subject(subID, subName, credit));
    }

    public void updateSubject() {
        int pos;
        String subID;
        String subName;
        String credit;
        boolean check = true;

        System.out.println("Input Subject ID want to Update: ");

        do {
            subID = sc.nextLine().trim().toUpperCase();

            pos = findSub(subID);
            if (pos < 0) {
                System.out.println("This Subject ID does not Exit");
                return;
            } else {
                System.out.println("Subject Name: ");
                do {
                    subName = sc.nextLine().trim().toUpperCase();
                    if (subName.equals("")) {
                        System.out.println("Subject Name can not NULL");
                        check = false;
                    } else {
                        check = true;
                    }
                } while (check == false);

                //**********************************
                String validCredit = "[0-9]";
                System.out.println("Subject Credit: ");
                do {
                    credit = sc.nextLine();
                    if (!credit.matches(validCredit)) {
                        System.out.println("Must be Integer");
                        check = false;
                    } else {
                        check = true;
                    }
                } while (check == false);

            }
        } while (pos < 0);

        subList.set(pos, (new Subject(subID, subName, credit)));
    }

    public void DeleteSubject() {
        int pos;
        String code;
        System.out.println("Input ID want to REMOVE: ");
        code = sc.nextLine().toUpperCase();
        pos = findSub(code);
        if (pos < 0) {
            System.out.println("does not exit");
        } else {
            subList.remove(subList.get(pos));
            System.out.println("The Subject with ID " + code + " has been REMOVED!");
        }
    }

//    public void printf() {
//        for (Subject sub : subList) {
//            System.out.println(sub.toString());
//        }
//    }
//***********************************************----------------------------------------------------***************************************************
//***********************************************----------------------------------------------------***************************************************
//***********************************************----------------------------------------------------***************************************************
    ArrayList<Grade> stuG = new ArrayList<>();

    double lab;
    double ProgressTest;
    double FinalExam;

    public void StudentGrade() {
        String StuID = "", SubID = "";
        int pos, posS;
        boolean check = false;

        do {
            Scanner scc = new Scanner(System.in);
            System.out.print("Input Student ID: ");
            StuID = scc.nextLine().toUpperCase();
            pos = findStu(StuID);
            if (pos < 0) {
                System.out.println("ID does not Exit");
                System.out.println("Re-Input Student ID : ");
            } else {
                check = true;
            }
        } while (check == false);

//        //  do {                                                         //Input ID Student
//        System.out.print("Input Student ID: ");
//        StuID = sc.nextLine().toUpperCase();
//
//        pos = findStu(StuID);
//        if (pos < 0) {
//            System.out.println("ID does not Exit");
//            check = false;
//        } else {
//            check = true;
//        }
//        // } while (check == false);
//        while (check == false) {
//            System.out.println("Re-Input Student ID : ");
//            StuID = sc.nextLine().toUpperCase();
//
//            pos = findStu(StuID);
//            if (pos < 0) {
//                System.out.println("ID does not Exit");
//                check = false;
//            } else {
//                check = true;
//            }
//        }
        do {                                                         //Input ID Subject
            Scanner scc = new Scanner(System.in);
            System.out.println("Input Subject ID : ");
            SubID = scc.nextLine().toUpperCase();
            posS = findSub(SubID);
            if (posS < 0) {
                System.out.println("This Subject ID does not Exit");
                check = false;
            } else {
                check = true;
            }
        } while (check == false);

        System.out.println("Input LAB grade: ");
        lab = sc.nextDouble();
        System.out.println("Iput PE");
        ProgressTest = sc.nextDouble();
        System.out.println("Input FE");
        FinalExam = sc.nextDouble();

        stuG.add(new Grade(lab, ProgressTest, FinalExam));
        System.out.println("Add Grade of Student with ID " + StuID + " Susscessfully!!!");

        System.out.println("***********************************");
//        for (int i = 0; i < stuG.size(); i++) {
//            System.out.println(stuG);
//        }

    }

    public void StudentGradeReport() {
        String StuID;
        Scanner scc = new Scanner(System.in);
        System.out.println("Input Student ID");
        StuID = scc.nextLine().trim().toUpperCase();
        int posG = findStu(StuID);
        if (posG < 0) {
            System.out.println("No report can be supported");

        } else {
            System.out.println("Studen ID: " + StuID);
            System.out.println("Student: " + stuList.get(posG).LastName + "" + stuList.get(posG).FirstName);
            System.out.println("The Template Table");
            System.out.println("No\t\tSubject\t\tAverage\t\tStatus");
            int count = 1;
            for (int i = 0; i < stuG.size(); i++) {
                if (StuID.equals(stuList.get(posG).StudentID)) {
                    System.out.print(count + "\t\t");
                    System.out.print(subList.get(i).getSubName() + "\t");
                    double avg = stuG.get(i).average();
                    System.out.print(avg + "\t\t");
                    if (avg >= 5) {
                        System.out.println("Pass");
                    } else {
                        System.out.println("Fail");
                    }
                    count++;
                }
            }
           count++;

        }
    }

    public void SubjectGradeReport() {
        String SubID;
        Scanner scc = new Scanner(System.in);
        System.out.println("Input Subject ID");
        SubID = scc.nextLine().trim().toUpperCase();
        int posG = findSub(SubID);
        if (posG < 0) {
            System.out.println("No report can be supported");
        } else {
            System.out.println("Subject ID: " + SubID);
            System.out.println("Subject Name: " + subList.get(posG).subName);
            System.out.println("The Template Table");
            System.out.println("Student ID     Name     Average     Status");
            //int count = 1;

            for (int i = 0; i < stuG.size(); i++) {
                if (SubID.equals(subList.get(i).subID)) {
                    //System.out.print(count+"\t");
                    System.out.print(stuList.get(i).StudentID + "\t");
                    System.out.print(stuList.get(i).LastName + " " + stuList.get(i).FirstName + "\t");
                    double avg = stuG.get(i).average();
                    System.out.print(avg + "\t");
                    if (avg >= 5) {
                        System.out.println("Pass");
                    } else {
                        System.out.println("Fail");
                    }

                }
            }
        }
    }
}
