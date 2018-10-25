import java.util.Scanner;

public class Solution {
	 void merge(String arr[], int l, int m, int r) 
	    {  
	        
	    	
	    	int n1 = m-l+1; 
	    	int n2 = r - m; 
	        String L[] = new String [n1]; 
	        String R[] = new String [n2]; 
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
	        	int s=L[i].compareTo(R[j]);
	            if (s<0) 
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
	    void sort(String arr[], int l, int r) 
	    { 
	        if(r-l<=7) {
	        	System.out.println("Insertion sort method invoked...");
	        	for (int i = l+1; i <=r; i++) {
					for (int j = i; j > 0; j--) {
						int s=arr[j-1].compareTo(arr[j]);
						if(s>0){
							String temp=arr[j];
							arr[j]=arr[j-1];
							arr[j-1]=temp;
						}
			
					}
				}
	        } else if (l < r) 
	        { 
	            int m = (l+r)/2; 
	            sort(arr, l, m); 
	            sort(arr , m+1, r); 
	            merge(arr, l, m, r); 
	        } 
	    } 
	    
	    static void printArray(String st[]) 
	    { 
	        String s1="["+st[0];
	        for (int i=1; i<st.length; i++) 
	        	 s1=s1+","+st[i];
	        System.out.println(s1+"]"); 
	        System.out.println(); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	Scanner scn=new Scanner(System.in);
	    	do {
	    		String st = scn.nextLine();
				String sp[] = st.split(",");
				Solution m=new Solution();
	    		m.sort(sp, 0, sp.length-1);   			
	            printArray(sp); 
	    	}while(scn.hasNext());
	    
	    } 
	} 

