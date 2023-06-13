import java.lang.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principle : ");
        int principle = sc.nextInt();
        System.out.print("\nRate of interest : ");
        float rateOfInterest = sc.nextFloat()/100/12;
        System.out.print("\nno. of years : ");
        int noOfYears = sc.nextInt()*12;
        double mortgage = ( principle * rateOfInterest * Math.pow( (1+rateOfInterest), noOfYears))/(Math.pow((1+rateOfInterest), noOfYears) - 1);
        System.out.println("Mortgage : "+mortgage);
    }
}