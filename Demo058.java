import java.util.Scanner;
class Demo058{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("factors of "+num+" is: ");
        for(int i=1;i<=num;i++){
            if(num % i == 0){
            System.out.print(" "+i);
        }
        }
    }
}
