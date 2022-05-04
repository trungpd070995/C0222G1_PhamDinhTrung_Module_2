package _case_study.service.impl;

import _case_study.models.facility_class.Facility;
import _case_study.models.facility_class.House;
import _case_study.models.facility_class.Room;
import _case_study.models.facility_class.Villa;
import _case_study.service.FacilityService;
import _case_study.ultis.RegexData;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {

    private static Map<Facility, Integer> facitityIntegerMap = new LinkedHashMap<>();
    private static List<Villa> villaList = new ArrayList<>();
    private static List<House> houseList = new ArrayList<>();
    private static List<Room> roomList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static final String REGEX_TYPE_NAME_STANDAR = "[A-Z][a-z]+"; //Kiểu chuẩn hoá tiêu chuẩn
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "^(SVHO)[-][0-9]{4}$";
    public static final String REGEX_ID_ROOM = "^(SVRO)[-][0-9]{4}$";
    public static final String REGEX_AMOUNT_MAXIMUM_QUANTITY = "^[1-9]|([1][0-9])|(20)$"; //Số lượng tối đa
    public static final String REGEX_AREA_POOL_AND_AREA_USE = "^([3-9]\\d|[1-9]\\d{2})$"; //Diện tích sử dựng
    public static final String REGEX_FLOORS = "[1-9][0-9]*";
    public static final String REGEX_COST = "[1-9][0-9]*"; //Chi phí

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facitityIntegerMap.entrySet()) {
            System.out.println("Service" + "" + element.getKey().toString() + " Số lần đã thuê: " + element.getValue());
        }

    }

    @Override
    public void displayMaintain() {

    }


    @Override
    public void addNewVilla() {

        String id = inputIdVilla(); // id

        String serviceName = inputServiceName(); // Tên dịch vụ

        double areaUse = Double.parseDouble(inputAreaUse()); //Diện tích sử dụng

        int rentanlPrice = Integer.parseInt(inputRentalPrice()); //Chi phí thuê

        int rentalPeopleMax = Integer.parseInt(inputRentalPeopleMax());//Số lượng người tối đa


        String styleRental = inputStyleRental(); //Kiểu thuê

        String standardVilla = inputStandar(); //Tiêu chuẩn phòng

        double areaPool = Double.parseDouble(inputAreaPool()); // Diện tích hồ bơi

        int floor = Integer.parseInt(inputFloor()); // Số tầng

        Villa villa = new Villa(id, serviceName, areaUse, rentanlPrice, rentalPeopleMax, styleRental, standardVilla, areaPool, floor);

        villaList.add(villa);
        facitityIntegerMap.put(villa, 0);

        System.out.println("Đã thêm mới thành công!");

    }

    private String inputIdVilla() {
        System.out.println("Nhập ID Villa : ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_VILLA, "Bạn đã nhập sai định dạng, mã dịch vụ SVVL-XXXX");
    }

    private String inputIdHouse() {
        System.out.println("Nhập ID House : ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_HOUSE, "Bạn đã nhập sai định dạng, mã dịch vụ SVHO-XXXX");
    }

    private String inputIdRoom() {
        System.out.println("Nhập ID Room : ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_ROOM, "Bạn đã nhập sai định dạng, mã dịch vụ SVRO-XXXX");
    }

    private String inputServiceName() {
        System.out.println("Nhập tên dịch vụ :");
        return RegexData.regexStr(scanner.nextLine(), REGEX_TYPE_NAME_STANDAR, "Bạn đã nhập sai địnhq dạng xin mời nhập lại !");
    }

    private String inputAreaUse() {
        System.out.println("Diện tích sử dụng : ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA_POOL_AND_AREA_USE, "Diện tích phải lớn hơn 30m2!");
    }

    private String inputRentalPrice() {
        System.out.println("Chi phí thuê : ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_COST, "Bạn phải nhập số dương");
    }

    private String inputRentalPeopleMax() {
        System.out.println("Nhập số lượng người tối đa: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AMOUNT_MAXIMUM_QUANTITY, "Số lượng người phải nhỏ hơn 20");
    }

    private String inputStyleRental() {
        System.out.println("Kiểu thuê : ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_TYPE_NAME_STANDAR, "Nhập sai định dạng ! Vui lòng nhập lại !");
    }

    private String inputStandar() {
        System.out.println("Tiêu chuẩn phòng: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_TYPE_NAME_STANDAR, "Nhập sai định dạng ! Vui lòng nhập lại !");
    }

    private String inputAreaPool() {
        System.out.println("Nhập diện tích hồ bơi: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA_POOL_AND_AREA_USE, "Diện tích hồ bơi phải lớn 30m2");
    }

    private String inputFloor() {
        System.out.println("Số tầng: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_FLOORS, "Nhập sai định dạng ! Vui lòng nhập lại!");
    }

    private String inputFreeService() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_TYPE_NAME_STANDAR, "Nhập sai định dạng !");
    }

    @Override
    public void addNewHouse() {

        String id = inputIdHouse(); //id

        String serviceName = inputServiceName();//Tên dịch vụ

        double areaUse = Double.parseDouble(inputAreaUse());//Diện tích sử dụng

        int rentanlPrice = Integer.parseInt(inputRentalPrice());//Chi phí thuê

        int rentalPeopleMax = Integer.parseInt(inputRentalPeopleMax()); //Số lượng người tối đa

        String styleRental = inputStyleRental();

        String standardHouse = inputStandar();

        int floorHouse = Integer.parseInt(inputFloor());

        House house = new House(id, serviceName, areaUse, rentanlPrice, rentalPeopleMax, styleRental, standardHouse, floorHouse);

        houseList.add(house);
        facitityIntegerMap.put(house, 0);

        System.out.println("Đã thêm mới thành công!");

    }

    @Override
    public void addNewRoom() {

        String id = inputIdRoom();

        String serviceName = inputServiceName();

        double areaUse = Double.parseDouble(inputAreaUse());

        int rentanlPrice = Integer.parseInt(inputRentalPrice());

        int rentalPeopleMax = Integer.parseInt(inputRentalPeopleMax());

        String styleRental = inputStyleRental();

        String freeService = inputFreeService();

        Room room = new Room(id, serviceName, areaUse, rentanlPrice, rentalPeopleMax, styleRental, freeService);
        roomList.add(room);
        facitityIntegerMap.put(room, 0);
        System.out.println("Đã thêm mới thành công!");

    }

}
