import java.util.*;
public class TollBooth {
    int totalCars;
    int totalCash;
    public TollBooth(){
        this.totalCars = 0;
        this.totalCash = 0;
    }
    public void payingCar(){
        totalCars++;
        totalCash += 50;
    }
    public void  nopayCar(){
        totalCars++;
    }
    void display(){
        System.out.println("Total Cars: "+ totalCars);
        System.out.println("Total Cash: "+totalCash+"/-");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TollBooth booth = new TollBooth();
        char choice;
        do{
            choice = sc.next().toLowerCase().charAt(0);
            switch (choice) {
            case 'p':
                booth.payingCar();
                break;
            case 'n':
                booth.nopayCar();
                break;
            case 'q':
                booth.display();
                break;
            default:
                System.out.println("Invalid Choice");
        }
        }
        while(choice != 'q');
    }
}
