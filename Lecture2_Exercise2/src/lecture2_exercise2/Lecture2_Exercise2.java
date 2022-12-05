
package lecture2_exercise2;

public class Lecture2_Exercise2 {

    public static void main(String[] args) {
       Person person1 = new Person("Cardo", "Probinsya", "0934827381728", "cardodalisay@gmail.com");
       Student student1 = new Student("Yughie", "GMA", "09381293241", "yughiep@gmail.com", 2);
       Employee employee1 = new Employee("Angela", "Tanza", "09995839481", "angelapaco@gmail.com", 216, 50000);
       Faculty faculty1 = new Faculty("Charles", "Silang", "091049285942", "charlesaquino@gmail.com", 334, 35000, "8am - 5pm", "Principal");
       Staff staff1 = new Staff("Juan", "ABS", "09583758374", "juancarlos@gmail.com", 104, 15000, "Vendor");
       
        System.out.println("Person:\n" + person1.toString() + "\n");
        System.out.println("Student:\n" + student1.toString() + "\n");
        System.out.println("Employee:\n" + employee1.toString() + "\n");
        System.out.println("Faculty:\n" + faculty1.toString() + "\n");
        System.out.println("Staff:\n" + staff1.toString() + "\n");    
    }
}


