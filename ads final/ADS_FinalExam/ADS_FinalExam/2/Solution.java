import java.util.Scanner;

class studentD
{
	int roll_number;
	String student_name;
	double total_marks;
	studentD(int roll_number, String student_name, double total_marks)
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
public static void hash(double marks1, double marks2, int size, studentD[] s)
	{ 
	for(int i=0;i<size;i++)
	{
		if(s[i].total_marks>=marks1&&s[i].total_marks<=marks2)
		{
			System.out.println(s[i].student_name);
		}
	}
	}
public static void hashg(double marks1, int size, studentD[] s)
{ 
for(int i=0;i<size;i++)
{
	if(s[i].total_marks<=marks1)
	{
		System.out.println(s[i].student_name);
	}
}
}
public static void hashl(double marks1, int size, studentD[] s)
{ 
for(int i=0;i<size;i++)
{
	if(s[i].total_marks>=marks1)
	{
		System.out.println(s[i].student_name);
	}
}
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	studentD[] s=new studentD[size];
	String str="";
	for(int i=0;i<size;i++)
	{
		str=sc.next();
		String[] st=str.split(",");	
		s[i]=new studentD(Integer.parseInt(st[0]),st[1],Double.parseDouble(st[2]));
	}	
	int n=sc.nextInt();
	String str1="";
	do {
		str1=sc.nextLine();
	    String [] q=str1.split(" "); 
	    switch(q[0])
    	{
    	case "BE": hash(Double.parseDouble(q[1]),Double.parseDouble(q[2]),size,s);
			break;
    	case "GE": hashg(Double.parseDouble(q[1]),size,s);
			break;
    	case "LE": hashl(Double.parseDouble(q[1]),size,s);
    		break;
    	}
	}while(sc.hasNextLine());
}


}
