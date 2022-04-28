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

        System.out.println("Nhập trình độ : ");
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
        System.out.println("Nhập vào mã khách hàng cần chỉnh sửa :");
        int id = Integer.parseInt(scanner.nextLine());
        for (Employee employee : employeeList) {
            if (id == employee.getId()) {
                System.out.println("Nhập id : ");
                employee.setId(Integer.parseInt(scanner.nextLine()));

                System.out.println("Nhập tên : ");
                employee.setName(scanner.nextLine());

                System.out.println("Nhập tuổi : ");
                employee.setAge(Integer.parseInt(scanner.nextLine()));

                System.out.println("Nhập địa chỉ : ");
                employee.setAddress(scanner.nextLine());

                System.out.println("Nhập giới tính : ");
                employee.setGender(scanner.nextLine());

                System.out.println("Nhập trình độ : ");
                employee.setLevel(scanner.nextLine());

                System.out.println("Nhập chức vụ : ");
                employee.setPosition(scanner.nextLine());

                System.out.println("Nhập lương : ");
                employee.setSalary(Integer.parseInt(scanner.nextLine()));

                System.out.println("Đã chỉnh sửa thành công!");
            }

        }

    }

    @Override
    public void delete() {

    }
}
