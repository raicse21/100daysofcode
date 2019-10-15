import java.util.Scanner;

public class QueueAtSchool {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int t=s.nextInt();
		String str= s.next();
		char[] a=str.toCharArray();
		while(t-->0) {
			for(int i=0;i<a.length-1;i++) {
				if(a[i]=='B' && a[i+1]=='G') {
					swap(a,i);
					i++;
				}
			}
		}
		for(char x: a ) {
			System.out.print(x);
		}
	}

	public static void swap(char[] a,int i) {
		a[i]='G';
		a[i+1]='B';
	}
}
