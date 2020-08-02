package CorejavaSample;
public class strrev {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Prakash");

		System.out.println(sb.reverse());

		StringBuffer sba = new StringBuffer("Pradip");
		System.out.println(sba.reverse());
		System.out.println(sba.append("pr"));
		System.out.println(sb.charAt(0));
	}

}
