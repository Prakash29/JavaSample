package CorejavaSample;
public class Para {
int za;
	
	Para(int z)
	{
		za=z;
		System.out.println(z);
	}
	
	void add(int i)
	{
		System.out.println(i);
		System.out.println(za);
	}
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Para p=new Para(4);
p.add(5);
	}

}
