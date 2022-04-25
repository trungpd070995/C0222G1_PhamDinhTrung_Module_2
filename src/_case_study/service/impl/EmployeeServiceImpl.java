package _case_study.service.impl;

import _case_study.person_class.Employee;
import _case_study.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

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

        Employee employee = new Employee(id, name , age , address , gender, level , position, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
