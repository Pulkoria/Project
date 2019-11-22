package programmes.numbers;

public class MultipleofFive {

    static void findfiveMultiples(int n) 
    { 
       
        int b = 5; 
        for (int i=1; i<=n; i++) 
        { 
            String s = ""; 
            if (i==b) 
            { 
                b = b+5;
                s = s + "Multiple of 5."; 
            } 
  
            if (s == "") {
                System.out.println(i);} 
             else { System.out.println(s); }
        } 
    } 
  
    public static void main (String[] args) 
    { 
        findfiveMultiples(50); 
    } 
}
