import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		switch(str)
		{
		case "String": int n=sc.nextInt();
						do
						{
							String s=sc.next();
							stringheap(s);
							//System.out.println("in switch"+" "+n);
							//sc.nextLine();
							//System.out.println(s);
						}while(sc.hasNextLine());
						break;
		case "Integer": int m=sc.nextInt();
						do
						{
							String t=sc.next();
							intheap(t);
						}while(sc.hasNextLine());
						break;
		case "Double": int o=sc.nextInt();
						do
						{
							String u=sc.next();
							doubheap(u);
						}while(sc.hasNextLine());
						break;
		case "Float":  int h=sc.nextInt();
						do
						{
							String v=sc.next();
							floheap(v);
						}while(sc.hasNextLine());
									break;
		}

	}

 static void stringheap(String s) {
	// System.out.println(s);
	String st[]=s.split(",");
	int p=st[0].compareTo(st[1]);
	//System.out.println(st[0].equals(st[1]));
		 if(p<=0)
		 {
			 //System.out.println();
		  System.out.println("true");
		 }
		 else
		 {
			// System.out.println();
		 System.out.println("false");
		 }
	}
 static void intheap(String t) {
String tt[]=t.split(",");
int a=Integer.parseInt(tt[0]);
int b=Integer.parseInt(tt[1]);
//System.out.println("a "+a);
//System.out.println("b "+b);
if(a<=b)
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}
		
	}
 static void doubheap(String u) {
	 String ss[]=u.split(",");
	 double c=Double.parseDouble(ss[0]);
	 double d=Double.parseDouble(ss[1]);
	if(c<=d)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	}
 static void floheap(String v) {
	 String q[]=v.split(",");
	 double e=Float.parseFloat(q[0]);
	 double f=Float.parseFloat(q[1]);
	if(e<=f)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
		
	}
}
