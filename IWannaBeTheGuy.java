import java.util.Scanner;

public class IWannaBeTheGuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] level=new int[n];
		int m=s.nextInt();
		int[] p=new int[m];
		for(int i=0;i<m;i++) {
			p[i]=s.nextInt();
			level[p[i]-1]=1;
		}
		int o=s.nextInt();
		int[] q=new int[o];
		for(int i=0;i<o;i++) {
			q[i]=s.nextInt();
			level[q[i]-1]=1;
		}
		int c=0;
		for(int i=0;i<level.length;i++) {
			if(level[i]==1) {
				c++;
			}
		}
		if(c==level.length) {
			System.out.println("I become the guy.");
		}else {
			System.out.println("Oh, my keyboard!");
		}
	}

}
