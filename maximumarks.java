package first;

import java.util.*;

public class maximumarks {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of semester: ");
		int semester=sc.nextInt();
		
		System.out.println("Enter no of subjects in 1 semester: ");
		int sem1=sc.nextInt();
		
		System.out.println("Enter no of subjects in 2 semester: ");
		int sem2=sc.nextInt();
		
		System.out.println("Enter no of subjects in 2 semester: ");
		int sem3=sc.nextInt();
		
		
		System.out.println("Marks obtained in semester 1: ");
		int[] s1=new int[sem1];
		for(int i=0;i<sem1;i++)
		{
			s1[i]=sc.nextInt();
			if(s1[i]<0 || s1[i]>100)
			{
				System.out.println("You have entered invalid mark");
			}
		}
		
		System.out.println("Marks obtained in semester 2: ");
		int[] s2=new int[sem2];
		for(int j=0;j<sem2;j++)
		{
			s2[j]=sc.nextInt();
			if(s2[j]<0 || s2[j]>100)
			{
				System.out.println("You have entered invalid mark");
			}
		}
		
		System.out.println("Marks obtained in semester 3: ");
		int[] s3=new int[sem3];
		for(int k=0;k<sem3;k++)
		{
			s3[k]=sc.nextInt();
			if(s3[k]<0 || s3[k]>100)
			{
				System.out.println("You have entered invalid mark");
			}
		}
		
		
		int max=s1[0];                  //Finding min and max
		for(int i=0;i<sem1;i++)
		{
			if(s1[i]>max)
				max=s1[i];
		}
		System.out.println("Maximum mark in 1 semester: "+max);
		
		
		int maxi=s2[0]; 
		for(int i=0;i<sem2;i++)
		{
			if(s2[i]>maxi)
				maxi=s2[i];
		}
		System.out.println("Maximum mark in 2 semester: "+maxi);
		
		
		int maximum=s3[0];
		for(int i=0;i<sem3;i++)
		{
			if(s3[i]>maximum)
				max=s3[i];
		}
		System.out.println("Maximum mark in 3 semester: "+maximum);
		
		
	}

}