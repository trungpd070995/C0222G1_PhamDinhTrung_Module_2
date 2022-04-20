package _15_debug.exercise.Illegal_triangle_exception;


public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) throws IllegalRightTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalRightTriangleException("Đây không phải là 3 cạnh của 1 tam giác. Giá trị nhập vào là phải là số dương!!!");
        } else if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalRightTriangleException("Đây không phải là 3 cạnh của 1 tam giác. Tổng 2 cạnh phải lớn hơn cạnh còn lại!!!");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}