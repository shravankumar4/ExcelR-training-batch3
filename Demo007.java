import java.util.Scanner;
public class Demo007 {
    public static void main(String[] args) {
        String name;
        int age;
        String phno;
        System.out.println("x:Enter your name, age, and phno");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your age");
        age = sc.nextInt();
        System.out.println("Enter your phno");
        phno = sc.nextLine();
        System.out.println("Hello "+name +"ur age is"+ age+"ur phnno is"+ phno);

    }}

