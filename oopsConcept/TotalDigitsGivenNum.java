package oopsConcept;

public class TotalDigitsGivenNum {

	public static void main(String[] args) {
        int totaldigits = 0, num = 3452;
        while(num != 0)
        {
            num /= 10;
           // System.out.println("Number of digits: " + num);     
            ++totaldigits;
           // System.out.println("Number of digits1: " + totaldigits);     
        }
        System.out.println("Total Number of digits: " + totaldigits);
    }
}
