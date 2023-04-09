/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author knc
 */
public class Date {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String day;
//        String month;
//        String year;
//
//        boolean validDay = true;
//        do {
//            System.out.print("Input DOB: ");
//
//            try {
//                String input = sc.nextLine();
//                if(input.length()<10)   validDay=false;
//                day = input.charAt(0)+"" + input.charAt(1)+"";
//                month = input.charAt(3) + "" + input.charAt(4) + "";
//                year = input.charAt(6) + "" + input.charAt(7) + "" + input.charAt(8) + "" + input.charAt(9) + "";
//            int d = Integer.parseInt(day);
//            int m = Integer.parseInt(month);
//            int y = Integer.parseInt(year);
//            if (d < 1) {
//                validDay = false;
//            }
//            if (d > 31) {
//                validDay = false;
//            }
//            if (m < 1) {
//                validDay = false;
//            }
//            if (m > 12) {
//                validDay = false;
//            }
//            if (y < 1) {
//                validDay = false;
//            }
//            if (y > 2020) {
//                validDay = false;
//            }
//            if (d == 0) {
//                validDay = false;
//            }
//            if (m == 0) {
//                validDay = false;
//            }
//            if (y == 0) {
//                validDay = false;
//            }
//            if (m == 2) {
//                if (y % 4 > 0) {
//                    if (d > 28) {
//                        validDay = false;
//                    }
//                }
//                if (d > 29) {
//                    validDay = false;
//                }
//            }
//                System.out.println(day+month+year);
//            if (validDay = false) {
//                System.out.println("Invalid day");
//            } else {
//                System.out.println("OKE");
//                validDay=true;
//            }            
//            } catch (Exception e) {
//                validDay=false;
//            }
//        } while (validDay == false);
        int day;
        int month;
        int year;
        boolean checkDay = true;
        boolean checkMonth = true;
        boolean checkYear = true;
        do{
            System.out.print("DOB: ");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        

        
        if (day < 1 || day > 31) {
            checkDay = false;
        }
        if (month < 1 || month > 12) {
            checkMonth=false;
        }
        if(year<1 || year>2020){
            checkYear=false;
        }
        
        
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day=30;
                break;
        }
        
        if(month ==2){
            if((year % 4==0 && year % 100 !=0) || year %400==0){
                if(day>29)
                checkDay=false;
            }else
                if(day>28)
                checkDay = false;
        }
        
        if(month ==4 & month ==6 & month ==9 & month ==11){
            day =30;
            checkDay=true;
        }else{
            day=31;
            checkDay=true;
        }
            System.out.println(checkDay);
            System.out.println(checkMonth);
            System.out.println(checkYear);
        }while(checkDay==false);
    
        
    }
}


