package org.sam.ala.data.structure;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = new int[]{10, 4, 5, 8, 6, 11, 26}; 
		
        int l = arr.length;
        
        quickSort(arr, 0, l-1);
        
        for (int a=0; a < l; ++a)
        {
        	System.out.print(arr[a] + " ");
        }
	}

	private static void quickSort(int[] arr, int low, int high) {
		
		if (low < high) 
        { 
		
			int partition = makePartion(arr,low,high);
		
			quickSort(arr, low , partition - 1);
			quickSort(arr, partition + 1, high);
        }
		
	}

	private static int makePartion(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j ++)
		{
			if(arr[j] < pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = pivot;
		arr[high] = arr[i+1];
		
		return i + 1;
		
	}

}
