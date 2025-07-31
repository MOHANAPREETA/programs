package first;

public class Quicksort {
	

	    // Function to partition the array around the pivot
	    public static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];  // choosing pivot as last element
	        int i = low - 1;        // index of smaller element

	        for (int j = low; j < high; j++) {
	            if (arr[j] < pivot) {
	                i++;
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        // Place pivot after the last smaller element
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;  // return the pivot index
	    }

	    // Main function that implements quicksort recursively
	    public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int pi = partition(arr, low, high);  // partition index

	            // Recursively sort elements before and after partition
	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }

	    // Driver code to test above
	    public static void main(String[] args) {
	        int[] arr = {10, 7, 8, 9, 1, 5};
	        int n = arr.length;

	        quickSort(arr, 0, n - 1);

	        System.out.println("Sorted array:");
	        for (int val : arr)
	            System.out.print(val + " ");
	    }
	}



