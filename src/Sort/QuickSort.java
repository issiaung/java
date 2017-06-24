package Sort;

public class QuickSort {
	static int[] array;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void sort(int[] input){
		if(input==null || input.length==0)
			return;

		array = input;
		quickSort(0, array.length-1);		
	}

	public static void quickSort(int low, int high){
		int i=low, j=high;
		//int pivot = array[low + (high-low)/2];
		int pivot = array[high];
		
		while(i < j){

			while(array[i] < pivot)
				i++;

			while(array[j] > pivot)
				j--;

			if(i<=j){
				swap(i, j);
				i++;
				j--;
			}

		}
		
		if(i<high)
			quickSort(i, high);
		
		if(j>low)
			quickSort(low, j);
	}

	private static void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}

