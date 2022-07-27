package Day_1;
import java.util.*;
class Calculator{

	//main function start from here	

	public static void main(String args[]){
		int a = 20, b = 8;
		System.out.println("\nAddition of "+a+" and "+b+" is = " + add(a, b)+"\n");
		System.out.println("\nSubtraction of "+a+" and "+b+" is = " + sub(a, b)+"\n");
		System.out.println("\nMultiplication of "+a+" and "+b+" is = " + mul(a, b)+"\n");
		System.out.println("\nDivision of "+a+" and "+b+" is = " + div(a, b)+"\n"); 	
	}

	//addition function start from here

	public static int add(int a, int b){
		return a + b;
	}

	//subtraction function start from here

	public static int sub(int a, int b){
		return a - b;
	}

	//multiplication function start from here

	public static int mul(int a, int b){
		return a * b;
	}
	
	//division function start from here

	public static float div(int a, int b){
		return (float)a / (float)b;
	}
}