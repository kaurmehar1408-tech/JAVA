import java.util.*;
// public class LabReadinessChecker{
//     public static void main(String[] args) {
//         System.out.println("JAVA LAB READINESS CHECK");
//         System.out.println("Student Name: ABC");
//         System.out.println("Labortary: Java Programming Lab");
//         System.out.println("Status: Java environment is ready.");
//         System.out.println("Compile: javac LabReadinessChecker.java");
//         System.out.println("Run: java LabReadinessChecker");
//     }
// }

// public class JVMJourney{
//     public static void main(String[] args) {
//         System.out.println("JVM EXECUTION JOURNEY");
//         System.out.println("Student: ABC");
//         System.out.println("1\\. Java Source Code (.java)");
//         System.out.println("2\\. Java Compiler (javac)");
//         System.out.println("3\\. ByteCode (.class)");
//         System.out.println("4\\. Class Loader");
//         System.out.println("5\\. JVM Execution Engine");
//         System.out.println("6\\. Machine Output");
//     }
// }

// public class SystemInfo{
//     public static void main(String[] args) {
//         System.out.println("SYSTEM INFORMATION");
//         System.out.println("Java Version: 21.0.2");
//         System.out.println("Operating System: Windows 11");
//         System.out.println("User Name: student");
//         System.out.println("Architecture: amd64");
//         System.out.println("Working Directory: C:\\JavaLab");
//     }
// }

// public class result{
//     public static void main(String[] args) {
//         int first, second, third, fourth, fifth;
//         Scanner sc = new Scanner(System.in);
//         result ob = new result();
//         first = sc.nextInt();
//         second = sc.nextInt();
//         third = sc.nextInt();
//         fourth = sc.nextInt();
//         fifth = sc.nextInt();
//         int total = first + second + third + fourth + fifth;
//         float percentage = (total / 500.0f)*100;
//         System.out.println("Total marks: "+ total + "/ 500");
//         System.out.println("Percentage: "+ percentage + "%");
//         if(percentage > 33){
//             System.out.println("Result: PASS");
//         }
//         else{
//             System.out.println("Result: FAIL");
//         }   
//     }
// }

// public class salary{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your salary: ");
//         double salary = sc.nextDouble();
//         double hra = (salary*20)/100;
//         double da = (salary*10)/100;
//         double pf = (salary*12)/100;
//         double gross = salary + hra + da;
//         double net  = gross-pf;

//         System.out.println("SALARY SLIP");
//         System.out.println("Basic Salary: Rs. "+ salary);
//         System.out.println("HRA (20%): Rs."+ hra);
//         System.out.println("DA (10%): Rs. "+ da);
//         System.out.println("PF (12%): Rs. "+ pf);
//         System.out.println("Gross Salary: Rs. "+ gross);
//         System.out.println("Net Salary: Rs. "+ net);

//     }
// }

// public class bill{
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the item price: ");
//     double itemprice = sc.nextDouble();
//     System.out.println("Enter quantity: ");
//     double quantity = sc.nextDouble();
//     System.out.println("Enter delivery charges: ");
//     double delivery = sc.nextDouble();
//     System.out.println("Enter discount percentage: ");
//     double dispercentage = sc.nextDouble();
//     System.out.println("ORDER BILL");
//     double stotal = itemprice*quantity;
//     System.out.printf("Subtotal: Rs. %.2f%n", stotal);
//     double discount = stotal * (dispercentage/100.0);
//     System.out.printf("Discount: Rs. %.2f%n", discount);
//     System.out.printf("Delivery charge: Rs. %.2f%n",delivery);
//     double finalam = stotal-discount;
//     System.out.printf("Final Payable Amount: Rs. %.2f%n", ( finalam + delivery));
//     }
// } 

// public class profile{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your name: ");
//         String name = sc.nextLine();
//         System.out.println("Enter your roll: ");
//         int roll = sc.nextInt();
//         sc.nextLine();
//         System.out.println("Enter the programme you are enrolled in: ");
//         String programme = sc.nextLine();
//         System.out.println("Enter semester no. ");
//         int sem = sc.nextInt();
//         sc.nextLine();
//         System.out.println("Enter your email: ");
//         String email = sc.nextLine();
//         System.out.println("Enter your city: ");
//         String city = sc.nextLine(); 
//         System.out.println("ADMISSION PROFILE");
//         System.out.println("Name: "+ name);
//         System.out.println("Roll Number: "+ roll);
//         System.out.println("Programme: "+programme);
//         System.out.println("Semester: "+ sem);
//         System.out.println("Email: "+ email); 
//         System.out.println("City: "+ city); 
//     }
// }

// public class receipt{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter item name: ");
//         String itemname = sc.nextLine();
//         System.out.println("Enter the unit price: ");
//         int unitprice = sc.nextInt();
//         sc.nextLine();
//         System.out.println("Enter quantity: ");
//         int quantity = sc.nextInt();
//         sc.nextLine();
//         System.out.println("Enter the GST rate:");
//         double gstrate = sc.nextDouble();
//         sc.nextLine();
//         System.out.println("CAFETERIA RECEIPT");
//         System.out.println("Item: "+ itemname);
//         double stotal = quantity*unitprice;
//         System.out.printf("Subtotal: Rs. %.2f%n",stotal);
//         System.out.printf("GST: Rs. %.2f%n",gstrate);
//         double finalam = stotal + gstrate;
//         System.out.printf("Grand Total: Rs. %.2f%n",finalam);
//     }
// }

// public class feedback {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the rating for content rating: ");
//     int contentrating = sc.nextInt();
//     sc.nextLine();
//     System.out.println("Enter the rating of explanation rating: ");
//     int explanationrating = sc.nextInt();
//     sc.nextLine();
//     System.out.println("Enter the rating for practical rating: ");
//     int practicalrating = sc.nextInt();
//     sc.nextLine();
//     System.out.println("TRAINING FEEDBACK");
//     System.out.println("Content: "+contentrating+"//5");
//     System.out.println("Explanation: "+ explanationrating+"/5");
//     System.out.println("Practical Work: "+practicalrating+"/5");
//     double averagerating = (contentrating + explanationrating + practicalrating)/3.0;
//     System.out.printf("Average Rating: %.2f/5%n",averagerating);
// }   
// }

// public class parkingfee{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter vehicle type: ");
//         int vehicletype = sc.nextInt();
//         System.out.print("Enter Parking Hours: ");
//         int parkinghours = sc.nextInt();
//         System.out.println("PARKING FEE");
//         System.out.println("Hours: "+ parkinghours);
//         if(vehicletype==1){
//             System.out.println("Vehicle: Two-wheeler");
//             if(parkinghours == 1){
//                 System.out.printf("Fee: Rs. %.2f%n",10);
//             }
//             else{
//                 double fee = ((parkinghours-1)*5) + 10;
//                 System.out.printf("Fee: Rs. %.2f%n",fee);
//             }
//         }
//         if(vehicletype==2){
//             System.out.println("Vehicle: Car");
//             if(parkinghours == 1){
//                 System.out.printf("Fee: Rs. %.2f%n",20);
//             }
//             else{
//                 double fee = ((parkinghours-1)*10) + 20;
//                 System.out.printf("Fee: Rs. %.2f%n",fee);
//             }
//         }
//     }
// }

// public class academicdecision{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your percentage: ");
//         int percentage = sc.nextInt();
//         System.out.println("Enter your attendance: ");
//         int attendance = sc.nextInt();
//         System.out.println("ACADEMIC DECISION");
//         if(percentage >= 85 && attendance >=90){
//             System.out.println("Grade: A");
//             System.out.println("Scholarship: Eligible");
//             System.out.println("Validation: Input accepted");
//         }
//         else{
//             System.out.println("Scholarship: Not Eligible");
//             System.out.println("Validation: Input rejected");
//         }
//     }
// }

// public class result{
//     public static int calculateTotal(int mark1, int mark2, int mark3, int mark4, int mark5){
//         return mark1 + mark2 + mark3 + mark4 + mark5;
//     }
//     public static double calculatePercentage(int total){
//         return ((double)total/500.0)*100;
//     }
//     public static boolean isPassed(double percentage){
//         if(percentage > 33){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int mark1, mark2, mark3, mark4, mark5;
//         System.out.print("Enter marks for subject1: ");
//         mark1 = sc.nextInt();
//         System.out.print("Enter marks for subject2: ");
//         mark2 = sc.nextInt();
//         System.out.print("Enter marks for subject3: ");
//         mark3 = sc.nextInt();
//         System.out.print("Enter marks for subject4: ");
//         mark4 = sc.nextInt();
//         System.out.print("Enter marks for subject5: ");
//         mark5 = sc.nextInt();

//         System.out.println("STUDENT RESULT");
//         int total = calculateTotal(mark1,mark2,mark3,mark4,mark5);
//         System.out.println("Total: "+ total);
//         double per = calculatePercentage(total);
//         System.out.printf("Percentage: %.2f%%%n",per);
//         if(isPassed(per)){
//             System.out.println("Status: PASS");
//         }
//         else{
//             System.out.println("Status: FAIL");
//         }
//         sc.close();
//     }
// }

// public class loanestimate{
//     public static int calculateInterest(int principalamount, int interest, int loanperiod){
//         return (principalamount*interest*loanperiod)/100;
//     }
//     public static int calculateTotalPayable(int principalamount, int interest){
//         return principalamount + interest;
//     }
//     public static int calculateMonthlyInstallment(int totalpayable, int months){
//         return totalpayable/months;
//     } 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the principal amount: ");
//         int principalamount = sc.nextInt();
//         System.out.print("Enter annual interest rate: ");
//         int interest = sc.nextInt();
//         System.out.print("Enter Loan period in years: ");
//         int loanperiod = sc.nextInt();
//         System.out.print("Enter number of months: ");
//         int months = sc.nextInt();

//         int finalinterest = calculateInterest(principalamount, interest, loanperiod);
//         int totalpayable = calculateTotalPayable(principalamount, finalinterest);
//         int monthlyinstallment = calculateMonthlyInstallment(totalpayable,months);
//         System.out.println("LOAN ESTIMATE");
//         System.out.println("Simple Interest: Rs. "+ finalinterest);
//         System.out.println("Total Payable: Rs. "+ totalpayable);
//         System.out.println("Monthly Installment: Rs. "+ monthlyinstallment);
//     }
// }

// public class fitnessreport{
//     public static float calculateBMI(int weight, float height){
//         return weight/(height*height);
//     }
//     public static String getBMICategory(float bmi){
//         if(bmi < 18.5){
//             return "Underweight";
//         }
//         else if(bmi >= 18.5 && bmi < 24.9){
//             return "Normal";
//         }
//         else if(bmi >= 24.9 && bmi < 29.9){
//             return "Overweight";
//         }
//         else{
//             return "Obese";
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your weight in kg: ");
//         int weight = sc.nextInt();
//         System.out.println("Enter height in metres: ");
//         float height = sc.nextFloat();
//         float bmi = calculateBMI(weight, height);
//         String category = getBMICategory(bmi);        System.out.println("FITNESS REPORT");
//         System.out.printf("BMI: %.2f\n",bmi);
//         System.out.println("Category: "+ category);
//         System.out.println("Recommendation: Maintain regular exercise and balanced diet.");
//     }

// }

// public class weeklyattendance{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[7];
//         int num[] = new int[7];
//         int present = 0;
//         int absent = 0;
//         for(int i=0;i<7;i++){
//             System.out.print("Enter any number 0/1 only : ");
//             num[i] = sc.nextInt();
//             if(num[i] == 0 || num[i] == 1){
//                 arr[i] = num[i];
//             }
//             else{
//                 System.out.println("Please enter a number 0 or 1 only: ");
//             }

//         }
//         for(int i=0;i<7;i++){
//             if(arr[i]==1){
//                 present++;
//             }
//             else{
//                 absent++;
//             }
//         }
//         double attendance = (present/7.0)*100;
//         System.out.println("WEEKLY ATTENDANCE");
//         System.out.println("Present Days: "+ present);
//         System.out.println("Absent Days: "+ absent);
//         System.out.printf("Attendance: %.2f%%%n", attendance);
//     }
// }

// public class marksDashboard{
//     public static void main(String[] args) {
//     int total = 0;
//     double average = 0;
//     int passed = 0;
//     int failed = 0;
//         Scanner sc = new Scanner(System.in);
//         int arr[] = new int[6];
//         for(int i=1;i<=5;i++){
//             System.out.print("Enter subject"+ i + " " + "marks: ");
//             arr[i] =sc.nextInt();
//         }
//         for(int i=1;i<=5;i++){
//             total += arr[i];
//         }
//         average = total/5.00;
//         for(int i=1;i<=5;i++){
//             if(arr[i]>40){
//                 passed++;
//             }
//             else{
//                 failed++;
//             }
//         }
//         System.out.println("MARKS DASHBOARD");
//         System.out.println("Total: "+ total);
//         System.out.printf("Average: %.2f",average);
//         System.out.println();
//         System.out.println("Passed Subjects: "+ passed);
//         System.out.println("Failed Subjects: "+ failed);
//     }
// }

public class expensereport{
    public static void main(String[] args) {
        int total = 0;
        double average = 0;
        int daysabovebudget = 0;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        for(int i=0;i<7;i++){
            System.out.println("Enter day" + i + " "+ "spending: ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<7;i++){
            total += arr[i];
        }
        average = total/7.00;
        for(int i=0;i<7;i++){
            if(arr[i] > 150){
                daysabovebudget++;
            }
        }
        System.out.println("EXPENSE REPORT");
        System.out.println("Total Spending: Rs."+ total);
        System.out.printf("Average Daily Spending: Rs.%.2f",average);
        System.out.println();
        System.out.println("Days above budget: "+ daysabovebudget);
    }
}