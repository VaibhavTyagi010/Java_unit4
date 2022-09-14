package question4;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortingAlgorithm s1=new BubbleSort();
		SortingAlgorithm s2=new SelectionSort();
		SortingAlgorithm s3=new Insertion_Sort();
		int arr[]= {1,4,6,8,9,3,1};
		s1.sort(arr, 7);
		System.out.println(Arrays.toString(arr));
		s2.sort(arr, 7);
		System.out.println(Arrays.toString(arr));
		s3.sort(arr, 7);
		System.out.println(Arrays.toString(arr));
	}

}
