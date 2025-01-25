import java.util.Scanner;
public class Demo043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().toUpperCase().charAt(0);
        char result = Character.toLowerCase(ch);
        System.out.println(result);
        sc.close();
    }
}
