package CorejavaSample;
public class StringDemo3 
{

		public static void main(String[] args)
		{
		String str="MyString is a is string";
		String reverse="";
		System.out.println(str.split(""));
		int length = str.length();
		for ( int i = length-1 ; i >= 0 ; i--)
		reverse = reverse + str.charAt(i);
		System.out.println("Given string is: "+str);
		System.out.println("Reverse of entered string is: "+reverse);
		}
		
}
