package employees;

public class ProductOwner extends Employee {

    private boolean certified;

    public ProductOwner(int employeeId, String team, String name) {
        super(employeeId, team, name);
    }

    public boolean isCertified() {
        return certified;
    }

    public void setCertified(boolean certified) {
        this.certified = certified;
    }

    @Override
    public String toString() {
        return super.toString() + ", Certified: " + certified;
    }
}
