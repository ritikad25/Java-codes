package mycode;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {

		int operator;
		Double number1, number2, result;

// create an object of Scanner class
		Scanner input = new Scanner(System.in);
		while (true) {
// ask users to enter operator
			//System.out.println("Choose an operator: + , - , * , / , % , ^ ");

			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Modulo");
			System.out.println("6.Raised to the Power");
//		System.out.println("7.Exit");
			System.out.println("Choose an operator:");
			operator = input.nextInt();

// ask users to enter numbers
			System.out.println("Enter first number");
			number1 = input.nextDouble();

			System.out.println("Enter second number");
			number2 = input.nextDouble();

			switch (operator) {
// performs addition between numbers
			case 1:
				result = number1 + number2;
				System.out.println(number1 + " + " + number2 + " = " + result);
				break;
// performs subtraction between numbers
			case 2:
				result = number1 - number2;
				System.out.println(number1 + " - " + number2 + " = " + result);
				break;
// performs multiplication between numbers
			case 3:
				result = number1 * number2;
				System.out.println(number1 + " * " + number2 + " = " + result);
				break;
// performs division between numbers
			case 4:
				result = number1 / number2;
				System.out.println(number1 + " / " + number2 + " = " + result);
				break;
// performs modulo between numbers			
			case 5:
				result = number1 % number2;
				System.out.println(number1 + " % " + number2 + " = " + result);
				break;
//performs raised to the power between numbers			
			case 6:
				result = Math.pow(number1, number2);
				System.out.println(number1 + " ^ " + number2 + " = " + result);
				break;
//		case 7:
//			System.exit(0);
//			System.out.println("Exited");
			default:
				System.out.println("Invalid operator!");
			}
			// input.close();
		}
	}
}