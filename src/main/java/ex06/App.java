/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex06;

import java.time.YearMonth;
import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String age = myApp.getAge();
        String retire = myApp.getRetire();
        int num1 = Integer.parseInt(age);
        int num2 = Integer.parseInt(retire);
        int left = myApp.yearsLeft(num1, num2);
        int year = myApp.getYear();
        int year2 = myApp.getRetireYear(left, year);
        String outputString = myApp.generateOutputString(left, year, year2);
        myApp.printOutput(outputString);
    }

    public String getAge() {
        System.out.print("Whats is your current age? ");
        return in.nextLine();
    }

    public String getRetire() {
        System.out.print("At what age would you like to retire? ");
        return in.nextLine();
    }

    public int yearsLeft(int num1, int num2) {
        return num2 - num1;
    }

    public int getYear(){
        return YearMonth.now().getYear();
    }

    public int getRetireYear(int left, int year) {
        return year + left;
    }

    public String generateOutputString(int left, int year, int year2) {
        return "You have "+left+" years left until you can retire.\nIt's "+year+", so you can retire in "+year2+".";
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}




