package CorejavaSample;
public class parents extends Child
{
public int add(int a,int b)
{
	return a+b;
	
}
public static void main (String args[])
{
	parents obj =new parents();
	obj.add(10, 20);
	
}
}
