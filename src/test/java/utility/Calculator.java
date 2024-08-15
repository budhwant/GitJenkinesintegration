package utility;

import org.testng.annotations.Test;

public class Calculator {
	@Test
	public void performCalculation() {
		
		System.out.println("Welcome to Calculator App!");
		
		int num1=5;
		int num2=10;
		String operation="+";
		int result=0;
		
		switch(operation) {
		case "+":
			System.out.println("Addition is being performed");
			result = num1 +num2;
			break;
		case "-":
			System.out.println("Substraction is being performed");
			result =num1 - num2;
			break;
		case "*":
			System.out.println("Multiplcation is being performed");
			result =num1 * num2;
		case "/":
			System.out.println("Division is being performed");
			result=num1 / num2;
			break;
		default:
			System.out.println("invalid operation.Please try agin");
		}
		System.out.println("Result:"+result);
	}

}
