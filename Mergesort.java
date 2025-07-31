package first;

public class Mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
	        for (int num : arr)
	            System.out.print(num + " ");

	        mergeSort(arr, 0, arr.length - 1);
	}
	   public static void mergeSort(int[] array, int low, int high) {
	        if (low < high) {
	            int mid = (low + high) / 2;

	            mergeSort(array, low, mid);

	            mergeSort(array, mid + 1, high);

	            merge(array, low, mid, high);
	        }
	    }

	    public static void merge(int[] array, int low, int mid, int high) {
	        int n1 = mid - low + 1;
	        int n2 = high - mid;

	        int[] left = new int[n1];
	        int[] right = new int[n2];

	        for (int i = 0; i < n1; i++)
	            left[i] = array[low + i];
	        for (int j = 0; j < n2; j++)
	            right[j] = array[mid + 1 + j];

	        int i = 0, j = 0, k = low;

	        while (i < n1 && j < n2) {
	            if (left[i] <= right[j]) {
	                array[k] = left[i];
	                i++;
	            } else {
	                array[k] = right[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < n1) {
	            array[k] = left[i];
	            i++;
	            k++;
	        }

	        while (j < n2) {
	            array[k] = right[j];
	            j++;
	            k++;
	        }
	    }

}
