import java.util.Scanner;

public class ChoosingTeams {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		int count = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] <= 5-k )
				count++;
		}
		System.out.println(count/3);

	}

}
