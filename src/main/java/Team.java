import csv.CSVReader;
import employees.Employee;

import java.util.List;

public class Team {

    private List<Employee> employees;

    public void populateEmployeeList(CSVReader reader) {

    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
