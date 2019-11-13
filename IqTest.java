import java.util.Scanner;

public class IqTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		int k=0;
		int kp=0;
		int l=0;
		int lp=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				k++;
				kp=i;
			}else {
				l++;
				lp=i;
			}
		}
		if(k==1)
			System.out.println(kp+1);
		else if(l==1)
			System.out.println(lp+1);
	}

}
