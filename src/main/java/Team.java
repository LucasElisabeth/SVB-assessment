import csv.CSVReader;
import employees.Employee;
import employees.ProductOwner;
import employees.Tester;
import employees.developers.Developer;
import employees.developers.LeadDeveloper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Employee> employees = new ArrayList<>();
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public void populateEmployeeList(CSVReader reader) {
        List<String> stringList = reader.readFile(new File("src/main/resources/organisation-data.csv"));
        List<String> teamList = new ArrayList<>();
        for (String str : stringList) {
            String[] strings = reader.translateLine(str);
            if (name.equals(strings[0])) {
                teamList.add(str);
            }
        }

        for (String str : teamList) {
            String[] strings = reader.translateLine(str);
            switch (strings[1]) {
                case "ProductOwner":
                    employees.add(new ProductOwner(Integer.parseInt(strings[2]), name, "Not known"));
                    break;
                case "Developer":
                    employees.add(new Developer(Integer.parseInt(strings[2]), name, "Not known"));
                    break;
                case "Tester":
                    employees.add(new Tester(Integer.parseInt(strings[2]), name, "Not known", false, null));
                    break;
                case "LeadDeveloper":
                    employees.add(new LeadDeveloper(Integer.parseInt(strings[2]), name, "Not known", 0, null));
                    break;
            }
            System.out.println("[" + name + "] : " + strings[1] + " added to team " + name);
        }
    }

    public String  getEmployeeDescription(int employeeId) {

        if (!employees.isEmpty()) {
            for (Employee employee : employees) {
                if (employee.getEmployeeId() == employeeId) {
                    return employee.toString();
                }
            }
        } else {
            System.out.println("There are no employees in this team.");
        }

        return null;
    }


    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
