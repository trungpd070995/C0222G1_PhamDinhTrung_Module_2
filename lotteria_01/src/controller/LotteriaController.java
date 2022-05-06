package controller;

import service.impl.LotteriaServiceImpl;

import java.util.Scanner;

public class LotteriaController {
    public static LotteriaServiceImpl lotteriaService = new LotteriaServiceImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("=====LOTTERIA MENU FIRM=====");
            System.out.println("=1=. Danh sách suất chiếu của rạp ==");
            System.out.println("=2=. Thêm mới suất chiếu ==");
            System.out.println("=3=. Xoá suất chiếu ==");
            System.out.println("=4=. Thoát ==");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println(" Nhập sai ! Vui lòng nhập lại ! ");
            }


            switch (choice) {
                case 1:
                    lotteriaService.displayLotteria();
                    break;
                case 2:
                    lotteriaService.addNewLotteria();
                    break;
                case 3:
                    lotteriaService.deleteLotteria();
                case 4:
                    System.exit(4);

            }
        }
    }
}
