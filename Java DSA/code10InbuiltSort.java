import java.util.*;
public class code10InbuiltSort {
    public static void printArr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArr(Integer arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1, 5, 7, 9 , 0, 2, -1, -3};
        int arr2[] = {4, 2, 1, 0, 3, 9, 7};
        Integer arr3[] = {5, 3, 9, -1, 0, 19 };
        Arrays.sort(arr); // Sorting Ascending Order Only O(n logn)
        Arrays.sort(arr2, 0, 4); // Sort Ascending Order - from Start index to End Index(End Index Excluded)
        printArr(arr);
        printArr(arr2);
        Arrays.sort(arr3, 0, 3, Collections.reverseOrder()); // ReverseOrder does not work on Normal Int Arrays. For this we declare Integer Arr[]. int > Integer.
        // Int is Primitive Arrays DataType Arrays.sort(arr) ascending only
        // Integer is an Object Array, supports comparator based sorting like Collections.reverseOrder() Descending Order
        printArr(arr3);
    }
}
