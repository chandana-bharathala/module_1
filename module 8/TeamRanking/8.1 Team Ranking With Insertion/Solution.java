import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of teams");
int n=sc.nextInt();
int[] wins=new int[n];
int[] losses=new int[n];
int[] draws=new int[n];
String[] team=new String[n];
for(int i=0;i<n;i++) {
	System.out.println("enter team name");
	team[i]=sc.next();
}
for(int i=0;i<n;i++) {
	System.out.println("enter wins of "+team[i]);
	wins[i]=sc.nextInt();
	System.out.println("enter losses of "+team[i]);
	losses[i]=sc.nextInt();
	System.out.println("enter draws of "+team[i]);
	draws[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
	int imin=i;
	for(int j=i+1;j<n-1;j++)
	{
		if(wins[j]>wins[imin])
		{
			System.out.println("in wins>");
			imin=j;
		}
		if(wins[j]==wins[imin])
		{
			System.out.println("in wins same");
			if(losses[j]<losses[imin])
			{
				System.out.println("in losses");
				imin=j;
			}
			if(losses[j]==losses[imin])
			{
				System.out.println("in loss same");
				if(draws[j]>draws[imin])
				{
					System.out.println("in draws");
					imin=j;
				}
			}
		}
		/*int temp=wins[i];
		wins[i]=wins[imin];
		wins[imin]=temp;
		int t=losses[i];
		losses[i]=losses[imin];
		losses[imin]=t;
		int te=draws[i];
		draws[i]=draws[imin];
		draws[imin]=te;*/
	String str=team[i];
	team[i]=team[imin];
	team[imin]=str;
	}
}
for(int i=0;i<n;i++)
{
	System.out.println("team : "+team[i]);
}
}
