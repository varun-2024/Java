import java.util.*;
public class code10InbuiltSort {
    public static void printArr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1, 5, 7, 9 , 0, 2, -1, -3};
        int arr2[] = {4, 2, 1, 0, 3, 9, 7};
        Arrays.sort(arr);
        Arrays.sort(arr2, 0, 4);
        printArr(arr);
        printArr(arr2);
    }
}
