import java.lang.String;
public class Main {
    public static void main(String[] args) {
          String msg = "hello";
        System.out.println(msg);
          msg+=" world";
        System.out.println(msg);
        System.out.println(msg.endsWith("ld"));
    }
}