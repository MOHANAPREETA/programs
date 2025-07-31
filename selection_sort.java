package first;

import java.util.Scanner;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		int[] arr=new int[x];
		for(int i=0;i<x;i++) {
			arr[i]=b.nextInt();
		}
	    Selectionsort(x,arr);

	}
	public static void Selectionsort(int x,int[] arr) {
		for(int i=0;i<x-1;i++) {
		int min=i;int temp=0;
		for(int j=i+1;j<x;j++) {
			if(arr[j]<arr[min])
				min=j;}
				
				temp = arr[min];
				arr[min]=arr[i];
				arr[i]=temp;}
			    
		for(int num:arr) {
			System.out.println(num+" ");
		
	}}

}
