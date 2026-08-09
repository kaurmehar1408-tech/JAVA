public class employee {
    private double salary;
    public employee(double salary){
        this.salary = salary;
    }
    public double getSalary() {
        return this.salary;
    }
    public class Marketer extends employee{
        public Marketer(double basesalary){
            super(basesalary);
        }
        @Override
        public double getSalary(){
            return super.getSalary() + 5000;
        }
    void message(){
        System.out.println("CodeQuotient - Get better at coding.");
    }
}
}
