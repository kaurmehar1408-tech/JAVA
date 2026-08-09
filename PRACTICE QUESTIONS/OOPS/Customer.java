public class Customer{
    private int id;
    private String name;
    private char gender;

        Customer(int id,String name, char gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    @Override
    public String toString(){
        return name + "(" + id + ")";

    }
    public class BankAccount{
        private int id;
        private double balance;
        private Customer customer;

    BankAccount(int id,Customer customer,double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    @Override
    public String toString(){
        return customer.toString() + " balance INR "+ String.format("%.2f",balance);
    }
    }
}
