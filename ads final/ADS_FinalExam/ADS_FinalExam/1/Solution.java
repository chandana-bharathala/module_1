import java.util.Scanner;

class student
{
	int roll_number;
	String student_name;
	double total_marks;
	student(int roll_number, String student_name, double total_marks)
	{
		this.roll_number=roll_number;
		this.student_name=student_name;
		this.total_marks=total_marks;
	}
	public String toString() {
		return roll_number+", "+student_name+", "+total_marks;
	}
}

public class Solution {
public static int hash(int roll,int size, student[] s2)
	{ 
		int sum=0;
		for(int i=1;i<=roll;i++)
		{
		sum=i*roll;
		}
		sum=sum%size;
		return sum;
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	student[] s=new student[size];
	String str="";
	for(int i=0;i<size;i++)
	{
		str=sc.next();
		String[] st=str.split(",");	
		s[i]=new student(Integer.parseInt(st[0]),st[1],Double.parseDouble(st[2]));
	}	
	int n=sc.nextInt();
	//System.out.println(n);
	String str1="";
	do {
		str1=sc.nextLine();
	    String [] q=str1.split(" "); 
	    System.out.println(q.length);
	    if(q.length>1) {
	    switch(Integer.parseInt(q[2]))
    	{
    	case 1: int x=hash(Integer.parseInt(q[1]),size,s);
    			System.out.println(s[x].student_name);
			break;
    	case 2: int y=hash(Integer.parseInt(q[1]),size,s);
				System.out.println(s[y].student_name+s[y].total_marks);
			break;
    	}
	    }
	}while(sc.hasNextLine());
}


}
