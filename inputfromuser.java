import java.util.Scanner;
public class inputfromuser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name :");
        String name = sc.next();
        System.out.println("welcome :"+name+" to java programming");
        sc.close();
    }
}
