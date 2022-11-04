package lecture2_exercise2;

public class Faculty extends Employee{
    String officeHours;
    String rank;
    
    Faculty(String name, String address, String phone, String email, int officeNo, double salary, String officeHours, String rank){
        super(name, address, phone, email, officeNo, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    @Override
    public String toString(){
    return super.toString() + "\nOffice hours: " + officeHours + "\nRank: " + rank;
    }
    
}
