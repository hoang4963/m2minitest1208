package employeemanager;

public class EmployeeParttime extends Employee{
    long workingTime;

    public EmployeeParttime() {
    }

    public EmployeeParttime(long workingTime) {
        this.workingTime = workingTime;
    }

    public EmployeeParttime(String employeeCode, String fullName, long age, String phoneNumber, String email, long workingTime) {
        super(employeeCode, fullName, age, phoneNumber, email);
        this.workingTime = workingTime;
    }

    public long getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(long workingTime) {
        this.workingTime = workingTime;
    }

    @Override
    long getSalary() {
        long salary = workingTime * 100000;
        return salary;
    }
}
