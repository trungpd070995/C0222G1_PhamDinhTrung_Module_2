package service.impl;

import model.Information;
import service.LotteriaService;
import utils.DateTimeCheck;
import utils.ReadAndWrite;
import utils.StarTimeException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LotteriaServiceImpl implements LotteriaService {
    public static String REGEX_ID = "CI-[0-9]{4}";
    public static Scanner scanner = new Scanner(System.in);
    public static List<Information> informationList = getInformationList();

    public static List<Information> getInformationList() {
        List<Information> informationList = new ArrayList<>();
        List<String[]> list = ReadAndWrite.readFile("src\\data\\information.csv");
        for (String[] temp : list) {
            informationList.add(new Information(temp[0], temp[1], temp[2], Integer.parseInt(temp[3])));
        }
        return informationList;
    }

    @Override
    public void displayLotteria() {
    List<Information> informationList = getInformationList();
        for (Information information : informationList){
            System.out.println(information.toString());
        }
    }

    @Override
    public void addNewLotteria() {
        List<String> stringList = new ArrayList<>();
        informationList = getInformationList();
        System.out.println("Nhập id : ");
        String id = "";
        boolean check;
        while (true) {
            check = false;
            while (true) {
                id = scanner.nextLine();
                if (id.matches(REGEX_ID)) {
                    break;
                } else {
                    System.out.println("Nhập sai định dạng vui lòng nhập lại theo CI-XXXX");
                }
            }

            for (Information temp : informationList) {
                if (id.equals(temp.getId())) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("Đã có trong danh sách !");
            }else {
                break;
            }
        }
        System.out.println("Nhập tên Film:");
        String nameFilm = scanner.nextLine();

        System.out.println("Thời gian bắt đầu :");
        String showDate;
        while (true){
            try {
                showDate = scanner.nextLine();
                DateTimeCheck.dateTimeCheck(showDate);
                break;
            }catch (StarTimeException e){
                System.err.println("Thời gian bắt đầu không thể trước ngày hôm nay!");
            }catch (Exception e){
                System.err.println("Bạn nhập không đúng định dạng ! Vui lòng nhập lại!");
            }
        }

        System.out.println("Số lượng vé :");
        int amount;
        while (true){
            try {
                amount = Integer.parseInt(scanner.nextLine());
                if (amount > 0) {
                    break;
                } else {
                    System.err.println("Số lượng vé nhập vào không hợp lệ ...!");
                }
            }catch (NumberFormatException e){
                System.err.println("Nhập sai định dạng !");
            }
        }

        String line = id + "," + showDate + "," + nameFilm + "," + amount;
        stringList.add(line);
        ReadAndWrite.writeFile("src\\data\\information.csv",stringList);
        System.out.println("Thêm thông tin thành công !");
    }

    @Override
    public void deleteLotteria() {
        List<String> stringList = new ArrayList<>();
    informationList = getInformationList();
    displayLotteria();
        System.out.println("Nhập ID muốn xoá");
        String id;
        while (true){
            id = scanner.nextLine();
            if (id.matches(REGEX_ID)){
                break;
            }else {
                System.out.println("Nhập sai id ! Định dạng id là : CI-XXXX !");

            }
        }

        boolean check = false;
        Information temp = null;
        for (Information information : informationList){
            if (id.equals(information.getId())){
                check = true;
                temp = information;
                break;
            }
        }

        if (check){
            int choice ;
            while (true){
                System.out.println("Bạn chắc chắn muốn xoá");
                System.out.println("1 . YES ");
                System.out.println("2 . NO ");
                try{
                    System.out.println("Vui lòng chọn");
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice == 1 || choice == 2){
                        break;
                    }
                }catch (NumberFormatException e){
                    System.out.println("Nhập sai định dạng");
                }
            }

            switch (choice){
                case 1:
                    informationList.remove(temp);
                    File file = new File("src\\data\\information.csv");
                    file.delete();

                    for (Information information: informationList) {
                        ReadAndWrite.writeFile("src\\data\\information.csv",stringList);
                    }
                    System.out.println("Đã xoá thành công !");
                    break;

                case 2:
                    System.out.println("Thoát");
                    break;
            }
        }else {
            System.out.println("ID không có trong danh sách");
        }
    }

}
