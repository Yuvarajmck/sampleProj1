import java.lang.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a=(int)(Math.random()*100);
        if(a>50){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        boolean res = a>50;
        String s = a>50 ? "It is more thn 50" : "it is less than 50";
        System.out.println(s);
    }
}