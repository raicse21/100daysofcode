import java.util.Scanner;

public class XeniaAndRingroad {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		long n=s.nextLong();
		long m=s.nextLong();
		long pos=1;
		long ans=0;
		for(long i=0;i<m;i++) {
			long x=s.nextInt();
			if(x>=pos)
				ans+=(x-pos);
			else 
				ans+= n - (pos - x);
			pos =x;
		}
		System.out.println(ans);
	}

}
