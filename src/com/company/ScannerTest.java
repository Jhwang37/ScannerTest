package com.company;
import java.util.Scanner;

public class ScannerTest{

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first initial: ");
        String firstInitial = scan.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine();

        System.out.println("Enter your house number: ");
        String houseNum = scan.nextLine();

        System.out.println("Enter your street name: ");
        String streetName = scan.nextLine();

        System.out.println("Enter your streetType: ");
        String streetType = scan.nextLine();

        System.out.println("Enter your city: ");
        String city = scan.nextLine();

        System.out.print(firstInitial + " " + lastName + " " + houseNum + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
