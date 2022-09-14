package question4;

public class Insertion_Sort extends SortingAlgorithm {

	@Override
	void sort(int[] arr, int n) {
		// TODO Auto-generated method stub
		 
	        for (int j = 1; j < n; j++) {  
	            int key = arr[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( arr [i] > key ) ) {  
	                arr [i+1] = arr [i];  
	                i--;  
	            }  
	            arr[i+1] = key;  
	}

}
}
