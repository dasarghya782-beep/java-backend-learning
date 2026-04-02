package day01;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = sc.nextInt();
        System.out.println("Enter an operator(+,-,*,/): ");
        char op=sc.next().charAt(0);

        System.out.println("Enter the second number: ");
        double b= sc.nextInt();

        double result;

        switch(op){
            case '+':
                result=a+b;
                System.out.println("Result: "+result);
                break;
            case '-':
                result=a-b;
                System.out.println("Result: "+result);
                break;
            case '*':
                result=a*b;
                System.out.println("Result: "+result);
                break;
            case '/':
                if(b==0){
                    System.out.println("Error: Division by zero.");
                }else{
                    result=a/b;
                    System.out.println("Result: "+result);
                    break;
                }
            default:
                System.out.println("Invalid Operator");
        }
        sc.close();

    }
}
