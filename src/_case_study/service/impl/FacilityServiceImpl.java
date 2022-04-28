package _case_study.service.impl;

import _case_study.models.facility_class.Facility;
import _case_study.models.facility_class.House;
import _case_study.models.facility_class.Room;
import _case_study.models.facility_class.Villa;
import _case_study.service.FacilityService;
import _case_study.ultis.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {

    public static final String REGEX_STR = "^[A-Z][a-z]+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2})$";


    private static Map<Facility, Integer> facitityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facitityIntegerMap.entrySet()) {
            System.out.println("Service" + "" + element + " Số lần đã thuê: " + element.getValue());

        }

    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("Nhập tên dịch vụ: ");
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

        Villa villa = new Villa(serviceName, areaUse, rentanlPrice, rentalPeopleMax, styleRental, standardVilla, areaPool, floor);
        facitityIntegerMap.put(villa, 0);
        System.out.println("Đã thêm mới thành công!");

    }

    private String inputId() {
        System.out.println("Nhap Id : ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_VILLA, "Bạn đã nhập sai định dạng, mã dịch vụ SVVL-XXXX");
    }


    @Override
    public void addNewHouse() {

        System.out.println("Tên dịch vụ: ");
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
        String standardHouse = scanner.nextLine();

        System.out.println("Số tầng : ");
        int floorHouse = Integer.parseInt(scanner.nextLine());

        House house = new House(serviceName, areaUse, rentanlPrice, rentalPeopleMax, styleRental, standardHouse, floorHouse);
        facitityIntegerMap.put(house, 0);
        System.out.println("Đã thêm mới thành công!");

    }

    @Override
    public void addNewRoom() {
        System.out.println("Tên dịch vụ: ");
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
        String freeService = scanner.nextLine();

        Room room = new Room(serviceName, areaUse, rentanlPrice, rentalPeopleMax, styleRental, freeService);
        facitityIntegerMap.put(room, 0);
        System.out.println("Đã thêm mới thành công!");

    }
}
