import java.util.Scanner;

public class calculator{
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("enter first number : ");
    double num1 =sc.nextDouble();

    System.out.println("enter operator (+,-,*,/) : ");

    char operator =sc.next().charAt(0);
    System.out.print("enter second number :");

    double num2= sc.nextDouble();

    double result;

    switch(operator){
      case '+':
      result = num1 + num2 ;
      System.out.println("result :" + result);
      break;
      case '-':
      result = num1 - num2 ;
      System.out.println("result :" + result);
      break;
      case '*':
      result = num1 * num2 ;
      System.out.println("result :" + result);
      break;
      case '/':
      if(num2!=0){
        result=num2/num1;
        System.out.println("result : "+ result);

      }
      else{
        System.out.println("error: division by zero not allowed as per my capacity.");

      }
      
      break;
      
      default:
      System.out.println("invalid operator !");
      


    }

    sc.close();

  }
}