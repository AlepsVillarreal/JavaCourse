package problems;

//Crear un programa que calcule la multiplicacion de matrices

public class NinthProblem {
	
    static void printMatriz(int[][] matriz) {
        for(int[] row : matriz) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
	
	static int[][] multiplicarMatrices(int[][]a, int[][]b, int r1, int c1, int c2) {
		
		int[][] resultado = new int[r1][c2];
				
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                	resultado[i][j] += a[i][k] * b[k][j];
                }
            }
        }
		
		return resultado;
	}
	
	public static void main(String args[]) {
		
		//Numero de columnas de la primer matriz debe ser igual que el numero de filas de la segunda matriz. c1 = r2
		
		int r1 = 2, c1 = 3;
		int r2 = 3, c2 = 2;
				
        int[][] sampleMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] anotherMatrix = { {2, 3}, {-9, 0}, {0, 4} };
		
		System.out.println("Multiplicar matriz: ");
		printMatriz(sampleMatrix);
		
		System.out.println("Por esta matriz: ");
		printMatriz(anotherMatrix);
		
		int[][] resultado = multiplicarMatrices(sampleMatrix, anotherMatrix, r1, c1, c2);
		
		System.out.println("Trae como resultado, esta matriz: ");
		printMatriz(resultado);
	}

}
