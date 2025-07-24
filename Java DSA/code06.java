import java.util.Scanner;

public class code06 {
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        float a = sc.nextFloat();
        System.out.println("Enter B:");
        float b = sc.nextFloat();
        System.out.println("Enter c:");
        float c = sc.nextFloat();
        float average = (a + b + c) / 3;
        System.out.println("Average  = " + average);
    }
    
}
