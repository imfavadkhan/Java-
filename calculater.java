import java.util.Scanner;
public class calculater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1 :");
        int subj1 = sc.nextInt();

        System.out.print("Enter marks for subject 2 :");
        int subj2 =  sc.nextInt();

        System.out.print("Enter marks for subject 3 :");
        int subj3 = sc.nextInt();

        System.out.print("Enter marks for subject 4 :");
        int subj4 = sc.nextInt();

        System.out.print("Enter marks for subject 5 :");
        int subj5 = sc.nextInt();

        
        int obtain_marks = subj1+subj2+subj3+subj4+subj5;
        System.out.println(obtain_marks);

        float percentage = (obtain_marks/500.0f)*100.0f;

        System.out.println("The percentage of the student in 5 subject is :"+percentage+"%");



    }
}
