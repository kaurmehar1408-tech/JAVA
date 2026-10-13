class student2{
    String name;
    int age;

    student2(String name,int age){
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
        System.out.println("Student's name: "+ name);
        System.out.println("Student's Age: "+ age);

    }
    public static void main(String[] args) {
        student2 s1 = new student2("ghi", 20);
        student2 s2 = new student2("jkl", 21);
        s1.displayInfo();
        s2.displayInfo();
    }
}