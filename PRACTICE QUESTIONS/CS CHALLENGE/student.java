class student{
    int age;
    String name;

    void displayInfo(){
        System.out.println("Student's Name: "+ name);
        System.out.println("Student's Age: "+ age);
    }
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "ABC";
        s1.age = 18;
        student s2 =  new student();
        s2.name = "DEF";
        s2.age = 18;
        s1.displayInfo();
        s2.displayInfo();
    }

}