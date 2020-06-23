package problems;

// Crear un programa que nos indique si un numero es primo o no

public class FifthProblem {
	
	public static void correctMethod(int num) {
        int i = 2;
        boolean flag = false;
        while(i <= num/2)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag)
            System.out.println(num + " es numero primo");
        else
            System.out.println(num + " no es numero primo");
	}
	
    public static void main(String[] args) {
    	int testNumber = 31;
    	
    	correctMethod(testNumber);
    }
}