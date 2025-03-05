package activities;

	import java.util.Arrays;

/*	
	class Activity4 {
	    static void ascendingSort(int array[]) {
	        int size = array.length, i;
	        
	        for (i = 1; i < size; i++) {
	            int key = array[i];
	            int j = i - 1;
	            
	            while (j >= 0 && key < array[j]) {
	                array[j + 1] = array[j];
	                --j;
	            }
	            array[j + 1] = key;
	        }
	    }
	    
	    public static void main(String args[]) {
	        int[] data = { 9, 5, 1, 4, 3 };
	        ascendingSort(data);
	        System.out.println("Sorted Array in Ascending Order: ");
	        System.out.println(Arrays.toString(data));
	    }
	}
*/
	
	public class Activity4 {
		public static void main(String[] args)
		{	int[] arr = new int[] {78, 34, 1, 3, 90, 34, 6, 55, 20};
		System.out.println("Array elements after sorting:");
		
		for (int i = 0; i < arr.length; i++)
		{
		for (int j = i + 1; j < arr.length; j++)
		{
		int tmp = 0;
		if (arr[i] > arr[j])
		{
		tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		}
		}
		//prints the sorted element of the array
		System.out.println(arr[i]);
		}
		}
		
	}
	

