import java.util.Scanner;
public class strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name :");
        String firtsNameString = sc.next();

        System.out.println("Enter your last name :");
        String lastNamString = sc.next();

        System.out.println("First Name :"+firtsNameString);
        System.out.println("Last Name :"+lastNamString);
        sc.nextLine();

        //Enter your full name in one line
        
        System.out.println("Enter your full name :");
        String fullNamString = sc.nextLine();

        System.out.println("FUll Name :"+fullNamString);

        sc.close();

    }
    
}
