package employeemanager;

public abstract class Employee implements Comparable<Employee> {
    String employeeCode;
    String fullName;
    long age;
    String phoneNumber;
    String email;

    public Employee() {
    }

    public Employee(String employeeCode, String fullName, long age, String phoneNumber, String email) {
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    abstract long getSalary();
    public static double getAverageSalary(Employee[] employees){
        double sum =0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum/ employees.length;
    }
    public static String showEmployeeHasSalaryLessThanAvgSalary(Employee[] employees, double avgSalary){
        String str ="Cac nhan vien co tien luong thap huong luong trung binh la";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < avgSalary){
                str += (employees[i].getFullName());
            }
        }
        return str;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.getSalary() < o.getSalary())
            return -1;
        else if (this.getSalary() > o.getSalary())
            return 1;
        else return 0;
    }
}
