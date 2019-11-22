package programmes.string;

public class RemoveWhiteSpaceinString {
	public static void main(String[] args) {
		String s = "How are you Mary";
		String removeWhiteSpace = s.replaceAll("\\s", "");
		System.out.println(removeWhiteSpace);
	}
	}

