package employees;

import csv.CSVReader;
import exceptions.InvalidEmployeeDataException;

import java.io.File;
import java.util.List;

public abstract class Employee implements Contractor {

    private int employeeId;
    private boolean contractor;
    private String name;
    private String team;
    private String role;

    public Employee(int employeeId, String team, String name) {
        this.employeeId = employeeId;
        this.team = team;
        this.name = name;
        role = this.getClass().getSimpleName();
    }

    public void setEmployeeData(CSVReader reader) throws InvalidEmployeeDataException {
        List<String> stringList = reader.readFile(new File("src/main/resources/employee-data.csv"));
        for (String str : stringList) {
            String[] strings = reader.parseLine(str);
            int id = 0;
            if ((id = Integer.parseInt(strings[0])) != 0) {
                if (id == employeeId) {
                    name = strings[1];
                    if (strings[2].equalsIgnoreCase("yes")) {
                        contractor = true;
                    }
                }
            } else {
                throw new InvalidEmployeeDataException();
            }
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public boolean isContractor() {
        return contractor;
    }

    public void setContractor(boolean contractor) {
        this.contractor = contractor;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{ employeeId=" + employeeId +
                ", contractor=" + contractor +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
