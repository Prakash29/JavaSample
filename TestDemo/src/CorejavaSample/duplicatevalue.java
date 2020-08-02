
package CorejavaSample;import java.util.HashSet;
import java.util.Set;

public class duplicatevalue {

	public static void main(String[] args) {
		try {

			String str[] = { "pms", "pms2", "prakash", "prakash", "nirs", "nirs", "pms" };

			System.out.println(str.length);

			for (int i = 0; i < str.length; i++) {
				for (int j = i + 1; j < str.length; j++) {
					if (str[i].equals(str[j]))

						System.out.println("duplicated value=" + str[i]);
				}
			}

			Set<String> st = new HashSet<String>();
			for (String str1 : str) {
				if (st.add(str1) == false) {
					System.out.println("duplicated element=" + str1);
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
