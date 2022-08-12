import employeemanager.Employee;
import employeemanager.EmployeeFulltime;
import employeemanager.EmployeeParttime;
import java.util.Arrays;

public class TestEmployee {
    public static void main(String[] args) {
        Employee Hoang = new EmployeeFulltime("1K42TSQTGH","Truong Huy Hoang",23,"0965934963","hoangth.finbox@gmail.com",1000000,0,5000000);
        Employee Duc = new EmployeeFulltime("2DHBKHN","Nguyen Viet Duc",23,"0974561154","robinduc9908@gmail.com",500000,500000,5000000);
        Employee Hiep = new EmployeeFulltime("3DHYTB","Tran Dai Hiep",23,"0339807704","hiepmirror@gmail.com",1500000,200000,5000000);
        Employee Chuc = new EmployeeFulltime("4K13DHDN","Luong Thi Thanh Chuc",21,"0977137641","luongthithanhchuc123@gmail.com",1500000,0,3000000);
        Employee Trang = new EmployeeFulltime("5BVK3TT","Truong Thu Trang",26,"0869650812","trangbeto96@gmail.com",8000000,0,4000000);
        Employee Quan =  new EmployeeParttime("6CGM122I1","Pham Hong Quan",28,"098223575","phamhongquan93@gmail.com",30);
        Employee Trung =  new EmployeeParttime("7CGM222I1","Pham Huy Trung",28,"092687267","trungloptruong93@gmail.com",40);
        Employee Vinh =  new EmployeeParttime("8CGM322I1","Nguyen Thanh Vinh",22,"0987419827","vinhvalorant@gmail.com",25);
        Employee Tuan =  new EmployeeParttime("9CGM422I1","Nguyen Thanh Tuan",24,"096514745","tuanimlang98@gmail.com",50);
        Employee Phong =  new EmployeeParttime("10CGM522I1","Nguyen Duy Phong",24,"0934842576","phamhongquan93@gmail.com",35);
        Employee[] employees = {Hoang,Duc,Hiep,Chuc,Trang,Quan,Trung,Vinh,Tuan,Phong};
//        luong trung binh cua employee
//        double avgSalary = Employee.getAverageSalary(employees);
//        System.out.println("Trung binh luong tat ca nhan vien la: "+ avgSalary );
//        Ham hien thi so nguoi cua muc luong thap hon luong trung binh cua emoloyee
//        Employee.showEmployeeHasSalaryLessThanAvgSalary(employees,avgSalary);
//        sap xet muc luong tang dan
        Arrays.sort(employees);
        for (int i = 0; i < employees.length; i++) {
            System.out.println("luong xep thu " +  (10 - i) +" la: " + employees[i].getFullName());
        }
    }
}
