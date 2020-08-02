package CorejavaSample;
public class dup {

	public static void main(String[] args)
	{
  String str="java is imp imp and java is neeed";
  
  String st[]=str.split(" ");
  
  char ch[]=str.toCharArray();
  
 for(int i=0;i<st.length;i++)
 {
	 for(int j=i+1;j<st.length;j++)
	 {
		 if(st[i].equals(st[j]))
		 {
			 System.out.println(st[i]);
		 }
	 }
 }
	}

}
