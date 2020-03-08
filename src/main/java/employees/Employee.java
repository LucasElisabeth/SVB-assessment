package employees;

public abstract class Employee implements Contractor{

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
}
