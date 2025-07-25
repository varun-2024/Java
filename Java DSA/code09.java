import java.util.*;
public class code09 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your income here :");
        float income = sc.nextFloat();
        float tax =0;
        float netIncome =0;
        if (income > 1000000) {
            tax = income * (30f/100f);
            netIncome = income - tax;
        } else if(income >= 500000 && income < 1000000){
            tax = income * (20f/100f);
            netIncome = income - tax;
        } else{
            tax = 0;
        }
    System.out.println(
        tax > 0
        ?"Your tax is : " + tax + " Your net income after tax is : " + netIncome
        : "There is no Tax to pay"
        );
}
}