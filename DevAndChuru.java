import java.util.Scanner;

public class DevAndChuru {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int d=s.nextInt();
		int[] a=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			sum +=a[i];
		}
		int ans=0;
		if(d-(sum+ (n-1)*10)>=5 ) {
			ans = (d-(sum+ (n-1)*10))/5;
			ans += (n-1)*2;
		}else if(d-(sum+ (n-1)*10)<0){
			ans = -1;
		}else {
			ans += (n-1)*2;
		}
		System.out.println(ans);
	}

}
