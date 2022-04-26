package _case_study.service.impl;

import _case_study.models.person_class.Employee;
import _case_study.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());

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

        System.out.println("Nhập cấp độ : ");
        String level = scanner.nextLine();

        System.out.println("Nhập chức vụ : ");
        String position = scanner.nextLine();

        System.out.println("Nhập lương : ");
        int salary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee(id, name, age, address, gender, level, position, salary);
        employeeList.add(employee);

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
