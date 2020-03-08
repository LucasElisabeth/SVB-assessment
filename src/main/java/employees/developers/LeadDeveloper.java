package employees.developers;

public class LeadDeveloper extends Developer {

    private int yearsOfExperience;
    private String technology;

    public LeadDeveloper(int employeeId, String teamName, String team, int yearsOfExperience, String technology) {
        super(employeeId, teamName, team);
        this.yearsOfExperience = yearsOfExperience;
        this.technology = technology;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
