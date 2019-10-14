import java.util.Scanner;

public class CheapTravel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();
		int ans=0;
        if(m*a<=b) {
        	ans=n*a;
        	System.out.println(ans);
        }else {
        	ans= b*(n/m) + Math.min( a*(n%m), b);
        	System.out.println(ans);
        }
	}
}
