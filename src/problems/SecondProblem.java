package problems;
import java.lang.Math; 

//- Crear un programa que nos ayude a resolver ecuaciones cuadraticas con la formula general


// x = -b +- 
public class SecondProblem {

	public static void CalcularEcuacionCuadratica(double b, double a, double c) {
		double result = Math.pow(b, 2) - 4.0 * a * c;
		System.out.println("Value of result before if is: " + result);
		
        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("Primera respuesta: " + r1 + "\nSegunda respuesta:" + r2);
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("Unica respuesta:" + r1);
        } else {
            System.out.println("La ecuacion no tiene respuesta");
        }
	}
	
	public static void main(String[] args) {
		double b = 10.0;
		double a = 8.0;
		double c = 2.0;
		
		CalcularEcuacionCuadratica(b, a, c);
	}

}
