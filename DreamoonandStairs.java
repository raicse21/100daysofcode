import java.util.Scanner;

public class DreamoonandStairs {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		if(n<m) {
			System.out.println(-1);
		}else{
			int x=0;
			if(n%2==0)
				x=n/2;
			else {
				x=n/2 +1;
			}
			
			for(int i=x;i<=n;i++) {
				if(i%m==0) {
					System.out.println(i);
					break;
				}
			}
		}
	}

}
