package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Crear un programa que transforme numeros romas a numeros arabigos

public class FourthProblem {

	public static void main(String[] args) {
		String RomanNumber = "XXI";
		
		int result = romanToArabic(RomanNumber);
		System.out.println("Resultado final es: " + result);

	}
	
	enum RomanNumeral{
	    I(1), IV(4), V(5), IX(9), X(10), 
	    XL(40), L(50), XC(90), C(100), 
	    CD(400), D(500), CM(900), M(1000);
		
		private int value;
		
		RomanNumeral(int value){
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
		
		public static List<RomanNumeral> GetReverseSortedValues(){
	        return Arrays.stream(values())
	                .sorted(Comparator.comparing((RomanNumeral e) -> e.value).reversed())
	                .collect(Collectors.toList());
	          }
	}
	
	
	public static int romanToArabic(String input) {
		int result = 0;
		String romanNumeral = input.toUpperCase();
		
		List<RomanNumeral> romanNumerals = RomanNumeral.GetReverseSortedValues();
		
		int i = 0;
		
		while((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
			RomanNumeral symbol = romanNumerals.get(i);
			if(romanNumeral.startsWith(symbol.name())) {
				result += symbol.getValue();
				romanNumeral = romanNumeral.substring(symbol.name().length());
	        } else {
	            i++;
	        }
		}
		
	    if (romanNumeral.length() > 0) {
	        throw new IllegalArgumentException(input + " no es un numero romano");
	    }else {
			return result;
	    }

	}

}
