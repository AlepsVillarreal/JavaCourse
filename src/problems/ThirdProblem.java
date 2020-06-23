package problems;

import java.util.Collections;
import java.util.HashSet;

//- Crear un programa que nos permita obtener el maximo comun divisor de 5 numeros

public class ThirdProblem {
	
	static int GCD(int a, int b)
	{
		if (a == 0)
			return b;
		
		return GCD(b%a, a);
	}
	
	public static void printAllDivisors(int NumberList[], int N) {
		//Find GCD of N numbers
		int g = NumberList[0];
		
		//Store all common divisors
		HashSet<Integer> divisors = new HashSet<Integer>();
		
		//Finding GCD of N numbers
		for(int i = 1; i < N; i++) {
			g = GCD(NumberList[i], g);
		}

		for(int i = 1; i * i <= g; i++) {
			if(g%i == 0) {
				divisors.add(i);
				if(g/i != i)
					divisors.add(g/i);
			}
		}
		
		int result = Collections.max(divisors);
		
		System.out.println("Maximo comun divisor es: " + result);

	}

	public static void main(String[] args) {
		int arr[] = {6, 30, 90, 12, 18, 30, 24};
		int n = arr.length;
		
		printAllDivisors(arr, n);

	}

}
