package Lab1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author knc
 */
public class Lab1 {

    public class Menu extends ArrayList {
    }

    public static void main(String[] args) {

        StudentManager stuL = new StudentManager();
        boolean check = true;
        String getUserChoice = null;
        do {
            System.out.println("------Menu--------");
            System.out.println("1- Add New Student");
            System.out.println("2- Update Student");
            System.out.println("3- Add New Subject");
            System.out.println("4- Update Subject");
            System.out.println("5- Enter Grade");
            System.out.println("6- Display Student Grade  Report");
            System.out.println("7- Dispaly Subject Grade Report");
            System.out.println("Others- Exit");
            System.out.println("Your Choices: ");
            Scanner sc = new Scanner(System.in);
            try {
                getUserChoice = sc.next();

                switch (getUserChoice) {
                    case "1":
                        stuL.addNewStudent();
                        break;
                    case "2":
                        stuL.subMenu();
                        break;
                    case "3":
                        stuL.addNewSubject();
                        break;
                    case "4":
                        stuL.subjectMenu();
                        break;
                    case "5":
                        stuL.StudentGrade();
                        break;
                    case "6":
                        stuL.StudentGradeReport();
                        break;
                    case "7":
                        stuL.SubjectGradeReport();
                        break;
                    default:
                        check = false;
                }
            } catch (Exception e) {
                check = false;
            }

        } while (check == true);

    }

}
