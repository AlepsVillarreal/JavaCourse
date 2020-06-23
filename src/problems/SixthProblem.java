package problems;

//- Crear un programa que valide si una cadena es un palindromo

public class SixthProblem {

	static boolean isPalindrome(String word) {		
		int i = 0, j= word.length()-1;
		
		while(i < j) {
			if (word.charAt(i) != word.charAt(j))
				return false;			
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String exampleWord = "anana";
		
		if(isPalindrome(exampleWord))
			System.out.println(exampleWord + " es palindromo");
		else
			System.out.println(exampleWord + " no es palindromo");
	}

}
