package _10_stack_queue.pratice.stack_using_array;

public class MyStack {
    /**arr có kiểu mảng số nguyên, lưu danh sách các phần tử trong stack*/
    private final int[] arr;

    /**size có kiểu số nguyên, lưu số phần tử trong stack*/
    private final int size;

    /**index có kiểu số nguyên, mặc định gán giá trị 0,
     * xác định vị trí của từng phần tử trong stack
     */
    private int index = 0;




    /**MyStack(int): khởi tạo số phần tử trong stack*/
    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    /**Phương thức push(): chèn phần tử mới vào stack*/
    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    /**Phương thức pop(): xoá phần tử khỏi stack*/
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    /**Phương thức size(): trả về số phần tử hiện tại của stack*/
    public int size() {
        return index;
    }

    /**Phương thức isEmpty(): kiểm tra xem stack có rỗng không*/
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }


    /**Phương thức isFull(): kiểm tra xêm stack có đầy không*/
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
}
