import java.lang.String;
public class Main {
    public static void main(String[] args) {
          String msg = "hello";
        System.out.println(msg);
          msg+=" world";
        System.out.println(msg);
        System.out.println(msg.endsWith("ld"));
        System.out.println(msg.toUpperCase());
        System.out.println(msg.replace("world", "earth"));
        System.out.println(msg.length());
        String txt_msg = "he said \"hello maria\"";
        System.out.println(txt_msg);
    }
}