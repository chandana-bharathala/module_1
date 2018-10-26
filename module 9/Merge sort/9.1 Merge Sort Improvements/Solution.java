import java.util.Scanner;

public class Solution {
		void merge(int arr[], int l, int m, int r) 
	          {  
	        int n1 = m-l+1; 
	    	int n2 = r - m; 
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	        for (int i=0; i<n1; ++i)
	        {
	            L[i] = arr[l + i];
	        }
	        for (int j=0; j<n2; ++j) 
	        {
	            R[j] = arr[m + 1+ j]; 
	        }
	        int i = 0, j = 0; 
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	        while (i < n1) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	        while (j < n2) 
	        { 
	            arr[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    }
		void insertion(int arr[], int l, int r)
		{
			
			int n=arr.length;
			for(int i=1;i<n;i++)
			{
				int min=arr[i];
				int j=i-1;
				while(j>0&&arr[j]>min)
				{
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=min;
			}
	    	
		}
		 void sort(int arr[], int l, int r) 
		    { 
		        if(r-l<=7) {
		        	System.out.println("Insertion sort method invoked...");
		        	insertion(arr, l,r);
		        }
		        else if (l < r) 
		        { 
		        	int m= (l+r)/2; 
		            sort(arr, l, m); 
		            sort(arr , m+1, r);
		            merge(arr, l, m, r); 
		        }  
		    } 
		 void convert(String arr[]) {
			 int n=arr.length;
		    	int[] a=new int[n];
		    	for(int i=0;i<n;i++)
		    	{
		    		a[i]=Integer.parseInt(arr[i]);
		    	}
		    	sort(a, 0, a.length-1);
		    	String s1="["+a[0];
		        for (int i=1; i<a.length; i++) 
		        	 s1=s1+","+a[i];
		        System.out.println(s1+"]"); 
		        System.out.println(); 
		 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Solution m=new Solution();
		do {
			String str=sc.next();
			String[] str1= str.split(",");
			m.convert(str1);
		}while(sc.hasNext());
	}

	}
