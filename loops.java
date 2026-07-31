public class loops {
    public static void main(String[] args){
        // simple while loop
        System.out.println("While loop");
        int a = 5;
        while(a>0){
            System.out.println(a);
            a--;
        }
        //simple do while loop
        System.out.println("Do While loop");
        int b = 1;
        do{
            System.out.println(b);
        }
        while(b>5);
        //simple for loop
        System.out.println("For loop");
        for(int i=0; i<5; i++){
            System.out.println(i);
        }
    }

}
