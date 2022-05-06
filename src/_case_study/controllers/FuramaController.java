package _case_study.controllers;

import _case_study.service.impl.CustomerSeviceImpl;
import _case_study.service.impl.EmployeServiceImpl;
import _case_study.service.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {

        displayMainMenu();
    }


    public static void displayMainMenu()  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Please select Options!------");
        while (true) {
            System.out.println("1. Employee Management ");
            System.out.println("2. Customer Management ");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management ");
            System.out.println("5. Promotion Management ");
            System.out.println("6. Exit ");


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
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn lại!");

            }
        }
    }


    public static void displayEmployeeMenu()  {
        EmployeServiceImpl employeService = new EmployeServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add new employee ");
            System.out.println("2. Display list employees ");
            System.out.println("3. Edit employee ");
            System.out.println("4. Return main menu ");


            switch (scanner.nextInt()) {
                case 1: {
                    employeService.addNew();
                    break;
                }
                case 2: {
                    employeService.display();
                    break;
                }
                case 3: {
                    employeService.edit();
                    break;
                }
                case 4: {
                    return;
                }

            }

        }
    }

    public static void displayCustomerMenu() {
        CustomerSeviceImpl customerSevice = new CustomerSeviceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add new customers ");
            System.out.println("2. Display list customers ");
            System.out.println("3. Edit customers ");
            System.out.println("4. Return main menu ");

            switch (scanner.nextInt()) {
                case 1: {
                    customerSevice.addNew();
                    break;
                }
                case 2: {
                    customerSevice.display();
                    break;
                }
                case 3: {
                    customerSevice.edit();
                    break;
                }
                case 4: {
                   return;
                }

            }
        }
    }

    public static void displayFacilityMenu()  {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add new facility");
            System.out.println("2. Display list facility ");
            System.out.println("3. Display list facility maintenance ");
            System.out.println("4. Return main menu ");

            switch (scanner.nextInt()) {
                case 1: {
                    addNewFacilityMenu();
                    break;
                }
                case 2: {
                    facilityService.display();
                    break;
                }
                case 3: {
                    facilityService.displayMaintain();
                    break;
                }
                case 4: {
                    return;
                }
            }
        }

    }

    public static void addNewFacilityMenu()  {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (true) {
            System.out.println("1. Add new villa ");
            System.out.println("2. Add new house ");
            System.out.println("3. Add new room ");
            System.out.println("4. Back to menu ");

            switch (scanner.nextInt()) {
                case 1: {
                    facilityService.addNewVilla();
                    displayFacilityMenu();
                    break;
                }
                case 2: {
                    facilityService.addNewHouse();
                    displayFacilityMenu();
                    break;
                }
                case 3: {
                    facilityService.addNewRoom();
                    displayFacilityMenu();
                    break;
                }
                case 4: {
                    displayMainMenu();
                    break;
                }
            }
        }

    }

    public static void displayBookingMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add new booking ");
            System.out.println("2. Dispay list booking ");
            System.out.println("3. Create new constracs ");
            System.out.println("4. Dispay list constracs");
            System.out.println("5. Edit contracts ");
            System.out.println("6. Return main menu ");

            switch (scanner.nextInt()) {
                case 4:
                    break;
            }
        }
    }

    public static void displayPromotionMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Display list customers use service");
            System.out.println("1. Display list customers get voucher");
            System.out.println("1. Return main menu");
        }
    }
}
