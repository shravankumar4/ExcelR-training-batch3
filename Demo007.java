import java.util.Scanner;
public class Demo007 {
  public static void main(String[] args) {
    String Name;
    int Age;
    long Phone;
    System.out.println("enter name,age and phone");
      Scanner sc = new Scanner(System.in);
      Name = sc.nextLine();
      Age = sc.nextInt();
      Phone = sc.nextLong();
      System.out.println("Hello"+ " " + Name + " " + "your age is" + " "+  Age + " " + "Your phone number is " + " " + Phone);

  }  
}
