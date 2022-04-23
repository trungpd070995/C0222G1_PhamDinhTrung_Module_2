package _12_java_collections_framework.exicese.collections_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Product> productArrayList = new ArrayList<>();
    static {
        productArrayList.add(new Product(1, "REDBULL", 40000,7));
        productArrayList.add(new Product(2, "COCA", 12000,6));
        productArrayList.add(new Product(3, "PIZZA", 20000,9));
        productArrayList.add(new Product(4, "ORANGE", 35000,8));
    }

    public void display(ArrayList<_17_binary_file_serialization.exercise.product_managerment.Product> listProduct) {
    }

    public void add() {
        System.out.println("Nhập id của sản phẩm");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = sc.nextLine();
        System.out.println("Nhập giá của sản phẩm:");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập só lượng sản phẩm");
        int quantity = Integer.parseInt(sc.nextLine());
        Product product = new Product(id, name, price, quantity);
        productArrayList.add(product);
    }

    public void update() {
        showAll();
        System.out.println("Nhập id sản phẩm muốn chỉnh sửa");
        int index = Integer.parseInt(sc.nextLine());

        boolean flag = false;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getIdProduct() == index) {
                System.out.println("Nhập tên mới của sản phẩm");
                productArrayList.get(i).setNameProduct(sc.nextLine());
                System.out.println("Nhập giá mới của sản phảm");
                productArrayList.get(i).setPrice(Double.parseDouble(sc.nextLine()));
                System.out.println("Nhập số lượng mới của sản phẩm");
                productArrayList.get(i).setQuantity(Integer.parseInt(sc.nextLine()));
            }
        }

    }

    public void delete() {
//        for (Product product: productArrayList) {
//            System.out.println(product);
//        }
        showAll();
        System.out.println("Chọn mã số sản phẩm bạn muốn xóa");
        int index = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getIdProduct() == index) {
                productArrayList.remove(i);
                break;
            }
        }
    }

    public void showAll() {
        for (Product product : productArrayList) {
            System.out.println(product);
        }
    }

    public void search() {
        System.out.println("Nhập tên sản phẩm cần tìm kiếm");
//        boolean exist = false;
//        Product product = null;
        String name = sc.nextLine();
//        for (int i = 0; i < productArrayList.size(); i++) {
//            if (productArrayList.get(i).getNameProduct().equals(name)) {
//                product = productArrayList.get(i);
//                exist = true;
//            }
//        }
//        if (exist) {
//            System.out.println(product);
//        } else {
//            System.out.println("Không tồn tại phần tử này");
//        }
        for (Product item : productArrayList) {
            if (item.getNameProduct().contains(name)) {
                System.out.println(item);
                break;
            }
        }
    }

    public void sortUpAscending() {
        Collections.sort(productArrayList, new SortUp());
        this.showAll();
    }

    public void sortDescending() {
        Collections.sort(productArrayList, new SortDown());
        this.showAll();
    }

    public void addNewProduct() {
    }
}