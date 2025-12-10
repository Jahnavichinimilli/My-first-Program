public class VariablesExample
{
   public static void main(String[] args)
   {
      int a= 10; 
      float b =2.5f;
      char c ='J'
      string d = "Janu";
      

      System.out.println(b); 
   }
}


import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();

        System.out.println("Choose an operator: + - * /");
        char opr = sc.next().charAt(0);

        double result = 0;
        boolean valid = true;

        switch (opr) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero");
                    return;
                }
                break;

            default:
                System.out.println("Invalid operator");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }
    }
}





























