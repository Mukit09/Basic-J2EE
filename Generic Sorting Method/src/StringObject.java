
public class StringObject implements Comparator<String> {

	@Override
	public int compareTo(String object1, String object2) {
		
		return object1.length()-object2.length();
	}

}
