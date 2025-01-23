import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String loginid = "Ashwitha";
        String pwd = "123";
        String reply;

        do { 
            System.out.println("Welcome to MRU");
            System.out.println("Have you visited our site earlier?");
            reply = scanner.nextLine();

            if (reply.equalsIgnoreCase("no")) {
                System.out.println("Please log in here.");
                System.out.println("Enter your ID and password:");
                loginid = scanner.nextLine();
                pwd = scanner.nextLine(); 
            } else {
                System.out.println("You are our valued customer.");
            }

        } while (!(loginid.equals("Ashwitha") && pwd.equals("123"))); 

        System.out.println("Login successful!");

        scanner.close();
    }
}
