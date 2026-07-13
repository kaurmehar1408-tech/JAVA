public class oops{
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object named p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "abc123";
        myAcc.setPassword("2345");
        
        Student s1 = new Student();
        Student s2 = new Student("jiya");
        Student s3 = new Student(123);
        // Student s4 = new Student("jiya",123);   this will throw error there no exists a constructor which have 1 strig parameter and other as a integer parameter.
    }
}
   class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}
class Student{
    String name;
    int roll;

    Student(){       // Constructors (Non-Parameterized)
        System.out.println("Constructor is being called");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}