package _case_study.service.impl;

import _case_study.models.person_class.Customer;
import _case_study.service.CustomerService;
import _case_study.ultis.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerSeviceImpl implements CustomerService {

    private static final List<Customer> customerList = new LinkedList<>();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {

        List<String[]> listCustomer = new ArrayList<>();
        listCustomer = ReadAndWriteFile.readFile("src\\_case_study\\data\\customer.csv");

        for (String[] temp : listCustomer) {
            Customer customer = new Customer(Integer.parseInt(temp[0]),temp[1],temp[2],temp[3],temp[4],temp[5],temp[6]);
            customerList.add(customer);
        }

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
        String dateOfBirth = (scanner.nextLine());

        System.out.println("Nhập địa chỉ : ");
        String address = scanner.nextLine();

        System.out.println("Nhập giới tính : ");
        String gender = scanner.nextLine();

        System.out.println("Nhập loại khách hàng : ");
        String typeCustomer = scanner.nextLine();

        System.out.println("Nhập căn cước công dân : ");
        String idCar = scanner.nextLine();

        Customer customer = new Customer(id, name, dateOfBirth, address, gender, typeCustomer, idCar);
//        customerList.add(customer);
        List<String> list = new ArrayList<>();
        list.add(id+","+name+","+dateOfBirth+","+address+","+gender+","+typeCustomer+","+idCar);
        ReadAndWriteFile.writeFile("src\\_case_study\\data\\customer.csv", list);
        System.out.println("Đã thêm mới khách hàng!");
    }

    @Override
    public void edit() {
        System.out.println("Nhập vào id của khách hàng cần chỉnh sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for (Customer customer : customerList) {
            if (id == customer.getId()) {
                System.out.println("Nhập id : ");
                customer.setId(Integer.parseInt(scanner.nextLine()));

                System.out.println("Nhập tên : ");
                customer.setName(scanner.nextLine());

                System.out.println("Nhập tuổi : ");
                customer.setDateOfBirth(scanner.nextLine());

                System.out.println("Nhập địa chỉ : ");
                customer.setAddress(scanner.nextLine());

                System.out.println("Nhập giới tính : ");
                customer.setGender(scanner.nextLine());

                System.out.println("Nhập loại khách hàng : ");
                customer.setTypeCustomer(scanner.nextLine());

                System.out.println("Nhập căn cước công dân : ");
                customer.setIdCar(scanner.nextLine());


                System.out.println("Đã chỉnh sửa thông tin khách hàng");
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập vào id của khách hàng cần chỉnh sửa");
        int id = scanner.nextInt();
        customerList.removeIf(customer -> id == customer.getId());
    }
}
