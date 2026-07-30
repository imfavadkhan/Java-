import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args){
        areaOfCircle();
    }
    public static void areaOfCircle(){
        float pi = 3.14f;
        float radius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of the circle :");
        radius = input.nextFloat();
        float area = pi*(radius*radius);
        System.out.println("Area of the circle is :"+area+" meter");
        input.close();
    }
    
}
