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