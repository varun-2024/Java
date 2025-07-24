import java.util.*;
public class code05 {
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Enter the value of A:");
        int a = sc.nextInt();
        
        System.out.println("Enter the value of B:");
        int b = sc.nextInt();
        
        System.out.println("Enter the value of C:");
        float c = sc.nextFloat();
        
        System.out.println("Enter the value of D:");
        double d = sc.nextDouble();
        
        System.out.println("Enter the value of E:");
        long e = sc.nextLong();
        
        float sum = a + b + c + + e;
        System.out.println("Sum of A and B is :" + sum);
    }
}

/* Conversion :
1. Type Compatible
2. Destination DataType > Source Data Type
Eg.
int a = 5;
long b = 10;
a=b; Error
b=a; Correct


vice versa is not possible it generates error Lossy Conversion
 */
//Traveling Left to Right Possible by not other way around
// >->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->
// Byte   >  Short  >  Int     >  Float   >  Long    >   Double
// 1 byte >  2 Byte >  4 Byte  >  4 Byte  >  8 byte  >   8 byte
//<-<-<-<-<-<-<-<-<-<-NOT POSSIBLE<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-