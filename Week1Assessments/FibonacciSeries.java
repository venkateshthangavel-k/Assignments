package Week1Assessments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 0;
        int b = 1;
        int n = 8;
        int c;
        
        for(int i=2;i<=n;i++) {
        	System.out.println(a + " , ");   
        	c = a + b;
        	a = b;
        	b = c;
        }
	}

}
