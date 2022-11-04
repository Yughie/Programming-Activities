package lecture2_exercise2;

public class Student extends Person{
    int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 2;
    public final static int JUNIOR = 3;
    public final static int SENIOR = 4;
    
    Student(String name, String address, String phone, String email, int status){
        super(name, address, phone, email);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nStatus: " + getStatus();
    }
}
