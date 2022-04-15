package _11_stack_queue.exercise.demerging_use_queue;

public class QueueByGender implements Comparable<QueueByGender> {
    /**Khai báo tên*/
    private String name;

    /**Khai báo giới tính*/
    private boolean gender;

    /**Khai báo tuổi*/
    private int age;

    public String getName() {
        return name;
    }
    /**Truy cập đến thuộc tính*/
    public void setName(String name) {
        this.name = name;
    }

    /**Phương thức trả về giá trị*/
    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**Phương thức truyền vào tham số */
    public QueueByGender(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public QueueByGender() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    /**tổ chức lại dữ liệu cho nữ được liệt kê trước nam.*/
    @Override
    public int compareTo(QueueByGender o) {
        if (this.getAge() > o.getAge()) {
            return 1;
        } else if (this.getAge() < o.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}