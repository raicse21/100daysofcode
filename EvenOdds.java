import java.util.Scanner;

public class EvenOdds {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		long k=s.nextLong();
		long a=0;
		if( k<=(n+1)/2  ) {
			a=(2*k)-1;
			System.out.println(a);
		}else {
			a= 2*( k -(n+1)/2);
			System.out.println(a);
		}
	}

}

