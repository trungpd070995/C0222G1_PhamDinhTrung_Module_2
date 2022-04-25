package _case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;

        while (check) {
            System.out.println("1. Employee Management ");
            System.out.println("2. Customer Management ");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management ");
            System.out.println("5. Promotion Management ");
            System.out.println("6. Exit ");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                default:
                    System.out.println("vui long chon lai");
                    break;

            }
        }
    }


    public static void displayEmployeeMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees ");
            System.out.println("2. Add new employee ");
            System.out.println("3. Edit employee ");
            System.out.println("4. Return main menu ");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
                    break;
            }

        }
    }

    public static void displayCustomerMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers ");
            System.out.println("2. Add new customers ");
            System.out.println("3. Edit customers ");
            System.out.println("4. Return main menu ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 2:
                    break;
            }
        }
    }

    public static void displayFacilityMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility ");
            System.out.println("2. Add new facility ");
            System.out.println("3. Display list facility maintenance ");
            System.out.println("4. Return main menu ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 3:
                    break;
            }
        }

    }

    public static void displayBookingMenu(){
        boolean check = true;
        while (check){
            System.out.println("1. Add new booking ");
            System.out.println("2. Dispay list booking ");
            System.out.println("3. Create new constracs ");
            System.out.println("4. Dispay list constracs");
            System.out.println("5. Edit contracts ");
            System.out.println("6. Return main menu ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 4:
                    break;
            }
        }
    }

    public static void displayPromotionMenu(){
        boolean check = true;
        while (check){
            System.out.println("1. Display list customers use service");
            System.out.println("1. Display list customers get voucher");
            System.out.println("1. Return main menu");
        }
    }
}
