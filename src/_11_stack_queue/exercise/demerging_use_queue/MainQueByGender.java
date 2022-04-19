package _11_stack_queue.exercise.demerging_use_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainQueByGender {
    public static void main(String[] args) {
        /**Phương thức tạo 2 Queue rỗng*/
        Queue<QueueByGender> male = new LinkedList<>();
        Queue<QueueByGender> falmale = new LinkedList<>();

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
                /**Kiểm tra nếu là giời tính male => add vào Queue male*/
                male.add(arr);
            } else {
                /**Kiểm tra nếu là giời tính falmale => add vào Queue falmale*/
                falmale.add(arr);
            }
        }
        List<QueueByGender> lists = new ArrayList<>();

        /**Phương thức xét Queue falmale, khi queue chưa rỗng*/
        while (falmale.size() > 0) {
            lists.add(falmale.remove());
        }

        /**Phương thức xét Queue male, khi queue chưa rỗng*/
        while (male.size() > 0) {
            lists.add(male.remove());
        }
        System.out.println("List after sorting: ");
        for (QueueByGender item : lists) {
            System.out.println(item.toString());
        }
    }
}