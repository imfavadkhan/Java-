class Main{
    public static void main(String[] args){
        // System.out.println("The sum of 5 and 10 is: " + (5 + 10));
        addTwoNUmbers();
        multiplyTwoNumbers();
    }
    public static void addTwoNUmbers(){
        int num1 = 5;
        int num2 = 10;
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
    public static void multiplyTwoNumbers(){
        int num1 = 5;
        int num2 = 10;
        int product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
    }
}