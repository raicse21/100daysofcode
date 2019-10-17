import java.util.Scanner;

public class GameofDeathinCircle {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0) {
			int n=s.nextInt();
			int k=s.nextInt();
			System.out.println(solution(n, k)+1);
		}
		s.close();
	}

	public static int solution(int n,int k) {
		if(n==1) {
			return 0;
		}
		int ans=solution(n-1,k);
		return (ans+k)%n;
	}
}
