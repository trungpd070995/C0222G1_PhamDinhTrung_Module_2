package _05_access_modifier.exercise.build_write_only_classes;

public class Student {
    private String name, classes;

    public Student() {
        this("John","C0222G1");
    }
    public Student(String name,String classes){
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public String setClasses(String classes) {
        return this.classes = classes;
    }
}
