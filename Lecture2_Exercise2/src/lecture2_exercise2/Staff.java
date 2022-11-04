package lecture2_exercise2;

public class Staff extends Employee{
    String title;
    
    Staff(String name, String address, String phone, String email, int officeNo, double salary, String title){
        super(name, address, phone, email, officeNo, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String toString(){
        return super.toString() + "\nTitle: " + title;
    }
}
