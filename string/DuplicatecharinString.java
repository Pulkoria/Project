package programmes.string;
public class DuplicatecharinString {
		public static void main(String[] args) {
			String s = "HowareyouMaryareyoufine";
			@SuppressWarnings("unused")
			int count = 0;
			char[] inte = s.toCharArray();
			System.out.print(" Duplicate Char:");
			for(int i=0; i<s.length(); i++) {
				for(int j=i+1; j<s.length(); j++) {
					if(inte[i] == inte[j]) {					
						System.out.print(inte[j]);
						count++;
						inte[j]=0;
						break;
					}
				}	
			}		

	}
	}
