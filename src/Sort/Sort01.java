package Sort;

public class Sort01 {

	int[] array;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}


	public void sort(int[] input){
		this.array = input;
		int len = input.length;
		int left = 0;
		int right = len-1;

		while(left<right){
			while(array[left] == 0)
				left++;
			
			while(array[right] == 1)
				right--;
			
			if(left<=right){
				array[left] = 0;
				array[right] = 1;
			}
		}

	}
}
