import java.util.Scanner;
public class studentPercentage {
    public static void main(String[] args){
        // scanner input = new Scanner(System.in)
        percentageCalculater();
    }
    public static void percentageCalculater(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter marks of maths :");
        int math = input.nextInt();
        System.out.print("enter marks of english :");
        int english = input.nextInt();
        System.out.print("enter marks of urdu :");
        int urdu = input.nextInt();

        int sum = math+english+urdu;
        float percentage = sum/300.0f*100;
        System.out.println("Final Percentage is :"+percentage+"%");
        input.close();
        

    }
}
