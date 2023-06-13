import java.lang.*;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
          final float pi = 3.14F;
          float r = 2.17F;
          double d = r+2*pi;
          int x = (int)d+5;
          String s = "10.0";
        System.out.println(x);
        System.out.println(Double.parseDouble(s));
        NumberFormat curr = NumberFormat.getCurrencyInstance();
        String res = curr.format(1234567.98765);
        System.out.println(res);
    }
}