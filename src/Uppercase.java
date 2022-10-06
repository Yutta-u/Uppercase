import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int a = string.charAt(0);
        char x = (char) a;
        if (a >= 65 && a <= 122 ) {
            if (a <= 90) {
                System.out.println((char) (a + 32));
            } else if (a >= 97){
                System.out.println((char) (a - 32));
            } else {
                System.out.println(x);
            }
        } else {
            System.out.println(x);
        }
    }
}
