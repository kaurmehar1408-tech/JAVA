// 1) Star Pattern
public class patterns{
//// 1) Star Pattern
public static void main(String[]args){
    int n = 5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
////2) Inverted Star Pattern
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i+1;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

////3) Inverted Pyramid Pattern
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }

////4) Character Pattern
// char ch = 'A';
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(ch);
//         ch++;
//     }
//     System.out.println();
// }

////5) Hollow Square
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n;j++){
//         if(i==1 || i==n || j==1 || j==n){
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }

////6) Inverted & Rotated Half Pyramid
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

////7) Inverted Number Pyramid
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i+1;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }

////8) Floyd's Triangle
// int count = 1;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(count+" ");
//         count++;
//     }
//     System.out.println();
// }

////9) 0-1 Triangle
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         if((i+j)% 2 == 0){
//             System.out.print(1+" ");
//         }
//         else{
//             System.out.print(0+ " ");
//         }
//     }
//     System.out.println();
// }

////10) Butterfly Pattern
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     for(int j=1;j<=2*(n-i);j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// for(int i=n;i>=1;i--){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     for(int j=1;j<=2*(n-i);j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

////11) Solid rhombus
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=n;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

////12) Hollow Rhombus
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=1;j<=n;j++){
//         if(i==1 || i==n || j==1 || j==n){
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }
}
}