package _case_study.service.impl;

import _case_study.models.person_class.Employee;
import _case_study.service.EmployeeService;
import _case_study.ultis.ReadAndWriteFile;
import _case_study.ultis.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static final String REGEX_BIRTHDAY = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

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

        System.out.println("Nhập tuổi: ");
        String dateOfBirth = RegexData.regexAge(scanner.nextLine(),REGEX_BIRTHDAY);

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

        Employee employee = new Employee(id, name, dateOfBirth, address, gender, level, position, salary);
        employeeList.add(employee);
        System.out.println("Đã thêm mới thành công !");
        ReadAndWriteFile.write(employeeList,true);

    }

    @Override
    public void edit() {
        display();
        List<Employee> employeeList1 = ReadAndWriteFile.read();
        System.out.println("Input id cần chỉnh sửa");
        String employeeEdit = scanner.nextLine();

        for (int i = 0; i < employeeList1.size() ; i++) {
            if (employeeEdit.equals(employeeList1.get(i).getId())){
                System.out.print("Enter again employee's name:");
                String employeeName = scanner.nextLine();
                System.out.print("Enter again employee's birth day:");
                String employeeBirthDay = scanner.nextLine();
                System.out.print("Enter again employee's genders:");
                String employeeGenders = scanner.nextLine();
                System.out.print("Enter again employee's position:");
                String employeePosition = scanner.nextLine();
                System.out.println("Nhập trình độ : ");
                String employeeLevel = scanner.nextLine();

                System.out.println("Nhập chức vụ : ");
                String employeeSalary = scanner.nextLine();



                employeeList1.get(i).setName(employeeName);
                employeeList1.get(i).setDateOfBirth(employeeBirthDay);
                employeeList1.get(i).setGender(employeeGenders);
                employeeList1.get(i).setLevel(employeeLevel);
                employeeList1.get(i).setPosition(employeePosition);
                employeeList1.get(i).getSalary(employeeSalary);

                ReadAndWriteFile.write(employeeList1,false);
                System.out.println("Editter");


        }
//        System.out.println("Nhập vào mã khách hàng cần chỉnh sửa :");
//        int id = Integer.parseInt(scanner.nextLine());
//        for (Employee employee : employeeList) {
//            if (id == employee.getId()) {
//                System.out.println("Nhập id : ");
//                employee.setId(Integer.parseInt(scanner.nextLine()));
//
//                System.out.println("Nhập tên : ");
//                employee.setName(scanner.nextLine());
//
//                System.out.println("Nhập tuổi : ");
//                employee.setDateOfBirth(scanner.nextLine());
//
//                System.out.println("Nhập địa chỉ : ");
//                employee.setAddress(scanner.nextLine());
//
//                System.out.println("Nhập giới tính : ");
//                employee.setGender(scanner.nextLine());
//
//                System.out.println("Nhập trình độ : ");
//                employee.setLevel(scanner.nextLine());
//
//                System.out.println("Nhập chức vụ : ");
//                employee.setPosition(scanner.nextLine());
//
//                System.out.println("Nhập lương : ");
//                employee.setSalary(Integer.parseInt(scanner.nextLine()));
//
//                System.out.println("Đã chỉnh sửa thành công!");
            }

        }

//    }

    @Override
    public void delete() {

    }
}
