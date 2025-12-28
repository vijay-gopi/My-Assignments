package week1.day2;

public class FibonacciSeries {
    public static void main(String[] args) {
    	
    	int range = 8;
    	int a = 0;
    	int b = 1;
    	int c, i;
        System.out.println("Fibonacci Series: ");
        for (i = 2; i < range; ++i) {
        	c = a + b;
        	System.out.println(c);
        	a = b;
        	b = c;
        	
        }

    }
}