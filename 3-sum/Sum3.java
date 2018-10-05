
public class Sum3 {
	int count=0;
	public void sum(int[] arr, int n)
	{
		int a,b,c;
		a=arr[0];
		for(int i=1;i<n;i++)
		{
			b=arr[i];
			for(int j=i+1;j<n;j++)
			{
				c=arr[j];
				if((a+b+c)==0)
				{
					count=count+1;
				}
				
			}
		}
		System.out.println(count);
	}

}
