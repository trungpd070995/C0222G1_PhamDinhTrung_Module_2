package _09_dsa_list.exercise.array_list;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**Hàm khởi tạo đối tượng*/
    public static void main(String[] args) {
        Student a = new Student(1, "Trung");
        Student b = new Student(2, "Dung");
        Student c = new Student(3, "Huy");
        Student d = new Student(4, "Hoang");
        Student e = new Student(5, "Khanh");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);

        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }
}



