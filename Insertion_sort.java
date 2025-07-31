package first;

import java.util.Scanner;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		int[] arr=new int[x];
		for(int i=0;i<x;i++) {
			arr[i]=b.nextInt();
		}
		Insertionsort(x,arr);
	}
	public static void Insertionsort(int x,int[] arr) {
		for(int i=0;i<x;i++) {
			int key=arr[i];
			int j=i-1;
			while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;		
		}for(int num:arr) {
			System.out.println(num+" ");
		
	}

}}
