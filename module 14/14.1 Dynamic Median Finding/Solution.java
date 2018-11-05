import java.util.Scanner;
public class Solution {
public static void insert(int[] a,int count, float[] median)
	{
	//sort(a,count,median);
	//System.out.println(a[count]);
	/*if(count==0)
	{
     median[0]= a[count];
	}
	else
	{
		//System.out.println(a[count]);
		sort(a,count,median);
		
	}*/
	}
public static void sort(int[] a,int count)
{
	float f=0;
	for(int i=1; i<count; i++)
	{
		int temp = a[i];
		int j = i-1;
		while(j>=0 && a[j] > temp)
		{
			a[j+1] = a[j];
			j = j-1;
		}
		a[j+1] = temp;
	}
//	System.out.println("count "+count);
		//System.out.println("median "+median[i]);
		if(count%2==0)
		{
			//System.out.println("in if");
		    f=(a[count]+a[count-1])/2;
		    System.out.println(f);
		}
		else
		{
			int b=count/2;
			f=a[b];
			System.out.println(f);
		}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int count=0;
	for(int i=0;i<n;i++)
	{
		count++;
		a[i]=sc.nextInt();
		sort(a,count);
	}
}	
}
