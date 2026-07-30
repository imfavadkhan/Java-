import java.util.Scanner;
public class Addition {
    public static void main(String[] args){
        additionTwoNumbers();

    }
    public static void additionTwoNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1 :");
        int num1 = input.nextInt();
        System.out.println("Enter num2 :");
        int num2 = input.nextInt();
        System.out.println("The addition of two numbers is :"+(num1+num2));
        input.close();

    }
}
