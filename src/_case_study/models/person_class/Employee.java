package _case_study.models.person_class;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }


    public Employee(int id, String name, String age, String address, String gender, String level, String position, int salary) {
        super(id, name, age, address, gender);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9) {
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary(String employeeSalary) {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                super.toString()+
                '}';
    }
}