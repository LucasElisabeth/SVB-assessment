package employees.developers;

import employees.Employee;

public class Developer extends Employee {

    protected boolean mentor;

    public Developer(int employeeId, String team, String name) {
        super(employeeId, team, name);
    }

    public boolean isMentor() {
        return mentor;
    }

    public void setMentor(boolean mentor) {
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mentor: " + mentor;
    }
}
