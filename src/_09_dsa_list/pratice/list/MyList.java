package _09_dsa_list.pratice.list;

import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10 ; //lưu số phần tử đối đa trong danh sách mặc định là 10.
    private int size = 0 ; //size xác định số phần tử trong danh sách, mặc định gán là 0.
    private Object[] elements ; //Mảng đối tượng elements chứa các phần tử trong danh sách


    /**Phương thức khởi tạo không tham số*/
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }


    /**Phương thức thay đổi số phần tử tối đa trong danh sách: ensureCapa()*/
    private void ensureCapa(){
        int newSize = elements.length * 2 ; /**Tăng gấp đôi kích thước mảng chứa các phần tử*/
        elements = Arrays.copyOf(elements,newSize);
    }


    /**Phương thức thêm một phần tử mới vào danh sách: add()*/
    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e ; /**thêm một phần tử vào cuối của danh sách*/
    }


    /**Phương thức truy cập một phần tử trong danh sách: get()
    Tham số đầu vào: số nguyên chứa vị trí cần truy cập đến phần tử trong danh sách*/
    public E get(int i) {
        if ( i >= size || i < 0 ){
            throw new IndexOutOfBoundsException("Index: " + i + ",Size" + i);
        }
        return (E) elements[i]; /**trả về phần tử vừa ở vị trí thứ i trong danh sách.*/
    }
}
