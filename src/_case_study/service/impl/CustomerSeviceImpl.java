package _case_study.service.impl;

import _case_study.models.person_class.Customer;
import _case_study.service.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerSeviceImpl implements CustomerService {

    private static List<Customer> customerList = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {

        System.out.println("Nhập id : ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên : ");
        String name = scanner.nextLine();

        System.out.println("Nhập tuổi : ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập địa chỉ : ");
        String address = scanner.nextLine();

        System.out.println("Nhập giới tính : ");
        String gender = scanner.nextLine();

        System.out.println("Nhập loại khách hàng : ");
        String typeCustomer = scanner.nextLine();

        System.out.println("Nhập căn cước công dân : ");
        String idCar = scanner.nextLine();

        Customer customer = new Customer(id,name,age,address,gender,typeCustomer,idCar);
        customerList.add(customer);
        System.out.println("Đã thêm mới khách hàng!");
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
