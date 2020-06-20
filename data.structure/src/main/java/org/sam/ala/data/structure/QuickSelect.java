package org.sam.ala.data.structure;

public class QuickSelect {
	
	//Given an array arr = [10, 4, 5, 8, 6, 11, 26]
	//Select k-th ( let say 3rd smallest element)
	//Output will 6

	public static void main(String[] args) {
		
		int[] array = new int[]{10, 4, 5, 8, 6, 11, 26}; 
                  
        int kPosition = 3; 
        int length = array.length; 
          
        if(kPosition > length) 
        { 
            System.out.println("Index out of bound"); 
        } 
        else
        { 
            // find kth smallest value 
            System.out.println("K-th smallest element in array : " +  
                                kthSmallest(array, 0, length - 1, 
                                                          kPosition - 1));
        }  

	}

	private static int kthSmallest(int[] array, int low, int high, int k) {
		
		int partition = makePartition(array,low,high,k);
		
		if (partition == k)
			return array[partition];
		
		else if (partition < k)
			return kthSmallest(array, partition + 1, high, k);
		else
			return kthSmallest(array, low, partition - 1, k);
	}

	private static int makePartition(int[] array, int low, int high, int k) {
		
		int pivot = array[high];
		int pivotLoc = low;
		
		for (int i = low; i <= high; i++)
		{
			if (array[i] < pivot)
			{
				int temp = array[i];
				array[i] = array[pivotLoc];
				array[pivotLoc] = temp;
				pivotLoc++;
			}
		}
		
		int temp = array[high]; 
		array[high] = array[pivotLoc]; 
		array[pivotLoc] = temp; 
          
        return pivotLoc;
		
	}

}
