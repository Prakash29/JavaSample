package CorejavaSample;
public class array {

	public static void main(String[] args)
	{
		try{
			
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		char ch[]=new char[3];
		ch[0]='p';
		ch[1]='s';
		ch[2]='3';
		System.out.println(ch.length);
		System.out.println(ch [0]);
		
		System.out.println(a.length);
		
		for(int i=0;i<=a.length;i++)
		{
			System.out.println(a[i]);
		}
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
}

}
