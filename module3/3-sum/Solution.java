import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//System.out.println("enter the size");
	int n=sc.nextInt();
	int[] arr=new int[n];
	//System.out.println("enter the elements");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	Sum3 s=new Sum3();
	s.sum(arr,n);	
}
}
