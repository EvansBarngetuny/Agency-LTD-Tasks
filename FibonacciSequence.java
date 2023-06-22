import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive Integer: ");
        int userInput = validateInput(scan);

        System.out.println("The Fibonacci sequence of "+ userInput+"i s :");
        printTheSequence(userInput);
    }
    // Here is Validations of User inputs to ensure that user don't enter negative integer
    private static int validateInput(Scanner scan){
        int input;
        while (true){
            String userInput = scan.nextLine();
            try{
                input = Integer.parseInt(userInput);
                if(input <= 0){
                    System.out.print("Please enter a positive integer: ");
                    continue;
                }
                break;
            }
            catch (NumberFormatException e){
                System.out.print("Invalid input. This program accepts positive integers only");
            }
        }
        return input;
    }
    //Printing the Fibonacci sequence up to the number entered by the user
    private static void printTheSequence(int num){
        int a = 0;
        int b = 1;

        System.out.print(a + " ");

        if(num >= 2) {
            System.out.print(b + " ");
        }
        for(int i=2; i<num; i++){
            int sum = a + b;
            System.out.print(sum + " ");
            a =b;
            b = sum;
        }
    }
}
