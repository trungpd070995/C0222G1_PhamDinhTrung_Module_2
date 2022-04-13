package _09_dsa_list.pratice.linked_list;

import javax.xml.soap.Node;

public class MyLinkedList {
    /**Các thuộc tính*/
    private Node head; /**head đối tượng lớp Node*/
    private int numNodes; /**numNodes size xác định số phần tử trong danh sách, mặc định gán là 0.*/


    /**Phương thức khởi tạo một tham số khởi tạo node đầu tiên trong danh sách*/
    public MyLinkedList(Object data) {
        head = new Node(data);
    }


    /**Phương thức thêm một phần tử mới vào danh sách: add()
     * Tham số đầu vào: vị trí thêm (index), đối tượng thêm (data)*/

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }


    /**Phương thức thêm một phần tử mới vào đầu danh sách: addFirst()*/
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }


    /**Phương thức truy cập một phần tử trong danh sách: get()*/
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    /**Phương thức printList() in các phần tử trong danh sách*/
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    /**Lớp MyLinkedList chứa lớp Node.*/
    private class Node {
        private Node next;
        private final Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
}