class parent{
    parent(){
        System.out.println("p");
    }
}
class c1 extends parent{
    c1(){
        System.out.println("c1");
    }
}
class c2 extends c1{
    c2(){
        System.out.println("c2");
    }
}
public class inheritance {
    public static void main(String[] args) {
        parent ob = new c1();
        parent ob1;
        ob1 = new c2();
        ob1 = new c1();
        ob1 = new parent();
    }
}
