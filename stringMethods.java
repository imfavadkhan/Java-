import java.util.Scanner;
public class stringMethods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.nextLine();

        System.out.println("Full Name :"+name);
        sc.close();

        int a = 5;
        int b = 6;
        System.out.printf("The value of a is %d and the value of b is %d ",a ,b);
    }
}
