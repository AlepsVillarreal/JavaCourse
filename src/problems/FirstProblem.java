package problems;

import java.util.Stack;

//1. Crear un programa que convierta un numero de decimal a un numero binario

public class FirstProblem {

	public static void MethodApproach(int i){
		System.out.println(Integer.toBinaryString(i));
	}
	
	public static void WithoutMethodApproach(int number){
		int binary[] = new int[40];
		int index = 0;
		
		while(number > 0) {
			binary[index++] = number%2;
			number = number/2;
		}
		
		for(int i = index-1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		
	}
	
	public static void StackApproach(int number){
		
		Stack<Integer> stack = new Stack<Integer>();
		
		while(number != 0)
		{
			int d = number % 2;
			stack.push(d);
			number /= 2;
		}
		
		while(!(stack.isEmpty())) {
			System.out.println(stack.pop());
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		int ExampleNumber= 5;
		
		System.out.println("\nUsing toBinaryString method:");
		MethodApproach(ExampleNumber);
		
		System.out.println("\nUsing old school method:");
		WithoutMethodApproach(ExampleNumber);
		
		System.out.println("\nUsing stack method:");
		StackApproach(ExampleNumber);

	}

}
 