import java.util.Scanner;
public class rectangleArea{
    public static void main(String[] args){
        areaOfRectangle();

    }
public static void areaOfRectangle(){
    Scanner input = new Scanner(System.in);
    float length;
    float width;
    System.out.print("Enter length of rectangle :");
    length = input.nextFloat();
    System.out.print("enter width of rectangle :");
    width = input.nextFloat();
    float area = (length * width)/2;
    System.out.print("Area of rectangle is :"+area+" meters");
    input.close();
}
}
