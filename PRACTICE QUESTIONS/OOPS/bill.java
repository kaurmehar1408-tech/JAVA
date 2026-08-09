public class bill {
    private double item_price;
    private int quantity;

    public bill(double item_price,int quantity){
        this.item_price = item_price;
        this.quantity = quantity;
    }
    public double getBillAmount(){
        return item_price*quantity;
    }
    public class cash extends bill{
        private int notes2000;
        private int notes500;
        private int notes100;
        private int notes50;
        private int notes10;

        public cash(double item_price,int quantity, int notes2000,int notes500,int notes100,int notes50,int notes10){
            super(item_price, quantity);
            this.notes2000 = notes2000;
            this.notes500 = notes500;
            this.notes100 = notes100;
            this.notes50 = notes50;
            this.notes10 = notes10;
        }
        public double cash_paid(){
            return (notes2000 * 2000) + (notes500 * 500) + (notes100 * 100) + (notes50 * 50) + (notes10 * 10);
        }

        public void payment(){
            double totalbill = getBillAmount();
            double totalpaid = cash_paid();

            if(totalbill == totalpaid){
                System.out.println("Clear");
            }
            else if(totalpaid < totalbill){
                double remaining = totalbill - totalpaid;
                System.out.println("Need to pay: "+ remaining);
            }
            else{
                double change  = totalpaid - totalbill;
                System.out.println("Change to return: "+ change);
            }
        }
    }
}
