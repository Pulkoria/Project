package programmes.string;

public class FindOutDuplicatesStringWord {
	public static void main(String[] args) {
		String s = "are you there Mary are you fine fine";
		s = s.toLowerCase();
		String words[] = s.split(" ");
		int count = 0;
		int i;
		for(i=0; i<words.length; i++) {
			count = 1;
			for(int j=i+1; j<words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j]="0";
				}
			}
			if(count>1 && words[i]!="0")
		System.out.print(words[i]);
		
		}		System.out.println("\t"+i);	

}
}