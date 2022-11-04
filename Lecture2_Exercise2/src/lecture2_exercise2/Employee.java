package lecture2_exercise2;

public class Employee extends Person{
    int officeNo;
    double salary;
    
    Employee(String name, String address, String phone, String email, int officeNo, double salary){
        super(name, address, phone, email);
        this.officeNo = officeNo;
        this.salary = salary;
    }

    public int getOfficeNo() {
        return officeNo;
    }

    public void setOfficeNo(int officeNo) {
        this.officeNo = officeNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nOffice No: " + officeNo + "\nSalary: $" + getSalary();
    }
}
