import java.util.Scanner;
public class Demo057{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum;
        int first_digit,last_digit;
        last_digit = num % 10;
        first_digit = num;
        while(first_digit>=10){
            first_digit/=10;
        }
        sum = first_digit + last_digit;
        System.out.println("sum of first and last digit of a number: "+sum);
        
    }
}
