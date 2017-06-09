package selectionSort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,2,9,4,3,7,-50};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(selectionSort(arr)));

	}
	
	public static int[] selectionSort(int[] arr) {
        int[] sorted = new int[arr.length]; 
        int len = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int minIdx = min(arr, len);
            sorted[i] = arr[minIdx];
            arr[minIdx] = arr[len - 1];
            len--;
        }
        return sorted;
    }
    
    public static int min(int[] arr, int len) {
        int minIdx = 0;
        int min = arr[0];
        for (int i = 0; i < len; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

}
