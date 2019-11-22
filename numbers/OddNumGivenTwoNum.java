package programmes.numbers;
import java.util.ArrayList;
import java.util.List;
public class OddNumGivenTwoNum {

		
		  private static List<Integer> getOddNums(int min, int max) {
		    return getNums(min, max);
		  }
		  
		  private static List<Integer> getNums(int min, int max) {
		    List<Integer> nums = new ArrayList<Integer>();
		    
		    for (int i = min; i < max ; i ++) {
		   if (i % 2 == 1) {
		        nums.add(i);
		      }
		    }
		    
		    return nums;
		  }
		  public static void main(String[] args) {
			    System.out.println(getOddNums(2, 20));
			  }
		}