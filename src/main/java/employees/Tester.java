package employees;

public class Tester extends Employee {

    private boolean python;
    private String automationToolName;

    public Tester(int employeeId, String team, String name, boolean python, String automationToolName) {
        super(employeeId, team, name);
        this.python = python;
        this.automationToolName = automationToolName;
    }

    public boolean isPython() {
        return python;
    }

    public void setPython(boolean python) {
        this.python = python;
    }

    public String getAutomationToolName() {
        return automationToolName;
    }

    public void setAutomationToolName(String automationToolName) {
        this.automationToolName = automationToolName;
    }

    @Override
    public String toString() {
        return super.toString() + ", python: " + python + ", Automation tool: " + automationToolName;
    }
}
