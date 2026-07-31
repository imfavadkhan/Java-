import java.util.Scanner;
public class conditionalStatements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Enter the value of a :");
        a = sc.nextInt();
        //simple if statement
        if(a>10){
            System.out.println("A is greater than 10");
        }
        //simple if else statement
        if(a>10){
            System.out.println("A is greater than 10");
        }else{
            System.out.println("A is less than or equal to 10");
        }
        //simple if, else if , else statement
        if(a>10){
            System.out.println("A greater than 10");
        }else if(a<10){
            System.out.println("A is less than 10");
        }else{
            System.out.println("A is equal to 10 or the value of A is 10");
        }

    }
}
