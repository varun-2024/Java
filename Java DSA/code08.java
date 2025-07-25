
import java.util.Scanner;

public class code08 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter cost of Pencil :");
        float pencil = sc.nextFloat();
        System.out.println("Please enter cost of Pen :");
        float pen = sc.nextFloat();
        System.out.println("Please enter cost of Eraser :");
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        float gst = total * (18f /100f ); // Made error here then corrected 18/100 = 0 int 18f/100f = float
        float finalAmount = total + gst;
        System.out.println("Total before tax = " + total + " Your tax is = " +  gst + " \nYour Final Amout = " + finalAmount);
    }
}
