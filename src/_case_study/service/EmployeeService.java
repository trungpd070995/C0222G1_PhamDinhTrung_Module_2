package _case_study.service;

import java.io.FileNotFoundException;

public interface EmployeeService extends Service {
    public void display();
    public void addNew() throws FileNotFoundException;
    public void edit();
    public void delete();
}
