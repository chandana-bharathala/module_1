import java.util.Scanner;

public class Solution {
	 int[] a;
	 int n;
	 int top =-1;
	 Solution (int n)
	 {
		 this.n=n;
		 a=new int[n];
	 }
	 boolean isEmpty(int t)
	 {
		 return t==-1;
	 }
	 boolean isFull(int t)
	 {
		 return t==this.n;
	 }
	 public void push(int n)
	 {
	 	if(top<(a.length-1))
	 	{
	 	top++;
	 	a[top]=n;
	 	}
	 	else
	 	{
	 		System.out.println("stack is full");
	 	}
	 }
	 public int pop()
	 {
	 	if(top>=0)
	 	{
	 		return a[top--];
	 	}
	 	else
	 	{
	 		System.out.println("stack is empty");
	 		return 0;
	 	}
	 }
	 public static void main(String args[]) {
		 Scanner s=new Scanner(System.in);
	 String a =s.nextLine() ;
	 int num=a.length();
	 String b[] = a.split(" ");
	 int n3=0;
	Solution  stack=new Solution (num);
	 	for(int i = 0;i<b.length;i++)
	 	{
	 	if(b[i].equals("*"))
	 	{
	 		int n1=stack.pop();
	 		int n2=stack.pop();
	 		n3=n1*n2;
	 		stack.push(n3);
	 		
	 	}
	 	else if(b[i].equals("+"))
	 	{
	 		int n1=stack.pop();
	 		int n2=stack.pop();
	 		n3=n1+n2;
	 		stack.push(n3);
	 		
	 	}
	 	else if(b[i].equals("-"))
	 	{
	 		int n1=stack.pop();
	 		int n2=stack.pop();
	 		n3=n1-n2;
	 		stack.push(n3);
	 		
	 	}
	 	else if(b[i].equals("/"))
	 	{
	 		int n1=stack.pop();
	 		int n2=stack.pop();
	 		n3=n1/n2;
	 		stack.push(n3);
	 		
	 	}
	 	else
	 	{
	 		int m=Integer.parseInt(b[i]);
	 		
	 		stack.push(m);
	 	}
	 	}
	System.out.println(stack.pop());
	 }
	 }
