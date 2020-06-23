package problems;

//- Crear un programa que ordene numeros usando burbuja

public class SeventhProblem {
	
	void bubbleSort(int arr[]) {
		int len = arr.length-1;
		for (int i = 0; i<len; i++)
			for(int j = 0; j<len-i; j++)
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	}
	
	void printArray(int arr[]) {
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		SeventhProblem ob = new SeventhProblem();
		int arr[] = {1, 2, 5, 7, 3, 20, 13, 15, 12, 10};
		
		ob.bubbleSort(arr);
		
		System.out.println("Arreglo despues del bubblesort: ");
		ob.printArray(arr);

	}

}
