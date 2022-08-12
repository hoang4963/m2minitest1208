package employeemanager;

public class EmployeeFulltime extends Employee{
    long bonusSalary;
    long pelnatySalary;
    long fixedSalary;

    public EmployeeFulltime() {
    }

    public EmployeeFulltime(long bonusSalary, long pelnatySalary, long fixedSalary) {
        this.bonusSalary = bonusSalary;
        this.pelnatySalary = pelnatySalary;
        this.fixedSalary = fixedSalary;
    }

    public EmployeeFulltime(String employeeCode, String fullName, long age, String phoneNumber, String email, long bonusSalary, long pelnatySalary, long fixedSalary) {
        super(employeeCode, fullName, age, phoneNumber, email);
        this.bonusSalary = bonusSalary;
        this.pelnatySalary = pelnatySalary;
        this.fixedSalary = fixedSalary;
    }

    public long getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(long bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public long getPelnatySalary() {
        return pelnatySalary;
    }

    public void setPelnatySalary(long pelnatySalary) {
        this.pelnatySalary = pelnatySalary;
    }

    public long getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(long fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
    @Override
    long getSalary() {
        long salary = fixedSalary + (bonusSalary - pelnatySalary);
        return salary;
    }
}
