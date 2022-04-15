package _11_stack_queue.exercise.demerging_use_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainQueByGender {
    public static void main(String[] args) {
        /**Phương thức tạo 2 Queue rỗng*/
        Queue<QueueByGender> NAM = new LinkedList<>();
        Queue<QueueByGender> NU = new LinkedList<>();

        /**Phương thức khởi tạo đối tượng khách hàng mới*/
        QueueByGender[] customers = new QueueByGender[5];
        customers[0] = new QueueByGender("Trung", true, 27);
        customers[1] = new QueueByGender("Huyen", false, 25);
        customers[2] = new QueueByGender("Phong", true, 23);
        customers[3] = new QueueByGender("Hai", true, 21);
        customers[4] = new QueueByGender("Thao", false, 18);
        /**Duyệt phần tử , add vào mảng */
        for (QueueByGender arr : customers) {
            if (arr.isGender()) {
                /**Kiểm tra nếu là giời tính NAM => add vào Queue NAM*/
                NAM.add(arr);
            } else {
                /**Kiểm tra nếu là giời tính NU => add vào Queue NU*/
                NU.add(arr);
            }
        }
        List<QueueByGender> lists = new ArrayList<>();

        /**Phương thức xét Queue NU, khi queue chưa rỗng*/
        while (NU.size() > 0) {
            lists.add(NU.remove());
        }

        /**Phương thức xét Queue NAM, khi queue chưa rỗng*/
        while (NAM.size() > 0) {
            lists.add(NAM.remove());
        }
        System.out.println("List after sorting: ");
        for (QueueByGender item : lists) {
            System.out.println(item.toString());
        }
    }
}