package _11_stack_queue.pratice.stack_list;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private final LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    /**Phương thức thêm một phần tử.*/
    public void push(T element) {
        stack.addFirst(element);
    }

    /**Phương thức xoá một phần tử.*/
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    /**Phương thức lưu kích thước phần tử*/
    public int size() {
        return stack.size();
    }

    /**Phương thức kiểm tra phần tử có trống hay không*/
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}