package _case_study.service.impl;

import _case_study.models.facility_class.Facility;
import _case_study.models.facility_class.Villa;
import _case_study.service.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facitityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {

    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("Tiêu chuẩn phòng: ");
        String serviceName = scanner.nextLine();

        System.out.println("Diện tích sử dụng : ");
        double areaUse = Double.parseDouble(scanner.nextLine());

        System.out.println("Chi phí thuê : ");
        int rentanlPrice = Integer.parseInt(scanner.nextLine());

        System.out.println("Số lượng người tối đa : ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());

        System.out.println("Kiểu thuê : ");
        String styleRental = scanner.nextLine();

        System.out.println("Tiêu chuẩn phòng : ");
        String standardVilla = scanner.nextLine();

        System.out.println("Diện tích hồ bơi : ");
        double areaPool = Double.parseDouble(scanner.nextLine());

        System.out.println("Số tầng : ");
        int floor = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(serviceName, areaUse, rentanlPrice, rentalPeopleMax, styleRental, standardVilla, areaPool,floor);
        facitityIntegerMap.put(villa, 0);
        System.out.println("Đã thêm mới thành công!");

    }

    @Override
    public void addNewHouse() {

    }

    @Override
    public void addNewRoom() {

    }
}
