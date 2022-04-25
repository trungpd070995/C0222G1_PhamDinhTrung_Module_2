package _case_study.service.impl;

import _case_study.person_class.Customer;
import _case_study.service.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {

    private static List<Customer> customerList = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {

    }

    @Override
    public void addNew() {
        System.out.println("Nhập id : ");
        int id = scanner.nextInt();

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập tuổi : ");
        int age = scanner.nextInt();

        System.out.println("Nhập địa chỉ : ");
        String address = scanner.nextLine();

        System.out.println("Nhập giới tính : ");
        String gender = scanner.nextLine();

        System.out.println("Nhập bằng cấp : ");
        String level = scanner.nextLine();

        System.out.println("Nhập chức vụ : ");
        String position = scanner.nextLine();

        System.out.println("Nhập lương : ");
        int salary = scanner.nextInt();

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
