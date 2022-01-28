package inheritanceExample;

public class StudentEmployee extends Student {
    private Double rateOfPayPerHour;
    private String employeeId;

    public StudentEmployee(String firstName, String lastName, String studentID, Double rateOfPayPerHour, String employeeId) {
        super(firstName, lastName, studentID);
        this.employeeId = employeeId;
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Double getRateOfPayPerHour() {
        return rateOfPayPerHour;
    }

    public void setRateOfPayPerHour(Double rateOfPayPerHour) {
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    @Override
    public String toString() {
        return super.toString() + "pay: " + rateOfPayPerHour + ", employeeId: '" + employeeId;
    }
}
