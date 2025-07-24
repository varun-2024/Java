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
        
        System.out.println("Enter the value of Radius:");
        int radius = (int)sc.nextFloat();
        System.out.println(radius);

        char f ='f';
        char g = 'g';
        System.out.println((int)f);
        System.out.println((int)g);
        System.out.println(f);
        System.out.println(c-g-f);
        //char h = f-g; // would give error here during conversion char is converted to int and allocating int value in char results in error.
        //System.out.println(h);
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

/* 
Type Conversion
Widening Conversion or Implicit Conversion
Traveling Left to Right Possible by not other way around
 >->->->->->->->->->->->->->->->->->->->->->->->->->->->->->->
 Byte   >  Short  >  Int     >  Float   >  Long    >   Double
 1 byte >  2 Byte >  4 Byte  >  4 Byte  >  8 byte  >   8 byte
<-<-<-<-<-<-<-<-<-<-NOT POSSIBLE<-<-<-<-<-<-<-<-<-<-<-<-<-<-<-


Type Casting : Narrowing Conversion Explicit Conversion
float marks = 36.98;
int finalmarks = (int)marks;

Type Promotion
char ch ='a';
int num = ch; // Value 97
If one operand is long, float or double the whole expression is promoted to long float or double(largest data type)
Byte, Short or Char treated as Int while evaluating an expression.

char h = f-g; // would give error here during conversion char is converted to int and allocating int value in char results in error.
Another example
short a = 5;
byte b = 25;
char c = 'c';
byte bt = a + b + c;

Results in Error, a,b & c are converted to int and assigning an Int value to Byte is not possible. Int is 4 bytes and byte is 1 byte. To solve this Typecast it to (byte).

byte bt = (byte)(a + b + c); // Output is not as expected -127 a+b+c = 5 + 25 + 99 = 129 which overflows the range of byte hence result is -127

int a =10;
float b = 25.25f;
long c = 35;
double d = 30;
double ans = a + b + c + d;
int ans = a + b + c + d; // Gives Error
converts all values a,b,c & d to double because d is a double datatype.
They assigns it to the variable ans. If ans is Double then its correct, but if ans in of type int then again results in error until Explicit Casting.
int ans =(int) (a + b + c + d);
 */