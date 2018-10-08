import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
    	LinkedList<Character> l1=new LinkedList<Character>();
    	char ch[]=number.toCharArray();
    	for(int i=0;i<ch.length;i++)
    	{
    		l1.add(ch[i]);
    	}
    	return l1;
    }

    public static String digitsToNumber(LinkedList list) {
    	String str = null;
    	Iterator it=list.iterator();
    	while(it.hasNext())
    	{
    		 String str1 = list.toString();
    	   
    		str=str+str1; 
    		//System.out.println("Str"+str);
    		it.next();
    	}

		return str;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    	Stack s1=new Stack();
    	Stack s2=new Stack();
    	LinkedList list3 = new LinkedList();
    	Iterator it1=list1.iterator();
    	while(it1.hasNext())
    	{
    	//	System.out.println("in method 3 list 1");
    		s1.push(list1);
    		it1.next();
    	}
    	Iterator it2=list2.iterator();
    	while(it2.hasNext())
    	{
    	//	System.out.println("in method 3 list 2");
    		s2.push(list2);
    		it2.next();
    	}
    	while((!s1.isEmpty())&&(!s2.isEmpty()))
    	{
    	//	System.out.println("in method 3 list pop");
    		int n=(int) s1.pop();
    		int m=(int) s2.pop();
    		Iterator it3=list3.iterator();
    		while(it3.hasNext())
    		{
    			list3.add(n+m);
    			it3.next();
    		}
    	}
return list3;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
               // System.out.println(AddLargeNumbers.numberToDigits(p));
                //System.out.println(AddLargeNumbers.numberToDigits(q));
                break;

            case "addLargeNumbers":
                LinkedList pDigits1 = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits1 = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
