

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	
	
void add( int a,int b)
{
	System.out.println(a+b);
}
void show(int a,String b)
{ System.out.println("rno is"+a+  "and"+" name is"+b);}

	
	
	public static void main(String[] args) {
Student s= new Student();
Student s1=new Student();
Student s3= new Student();
s.add(1, 11);
		s1.add(1, 11);
		s3.show(22, "pradip");
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s3);
		al.add(s);
		al.add(s1);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
	System.out.println(al.toString());
	}
}
