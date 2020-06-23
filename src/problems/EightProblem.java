package problems;

import java.util.Arrays;

//- Crear un programa que ordene strings usando quick sort
// usando el ultimo elemento como pivote

public class EightProblem {

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3, 3};
        quickSort(arr, 0, arr.length-1);
        System.out.println("Arreglo despues de haberse sorteado: " + Arrays.toString(arr));
    }
 
    public static void quickSort(int[] arr, int start, int end){
 
        int partition = partition(arr, start, end);
 
        if(partition-1>start) {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
    }
 
    
    //Separa el arreglo en dos - usando de base el ultimo elemento del arreglo.
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
 
        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }
 
        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;
 
        return start;
    }
}
