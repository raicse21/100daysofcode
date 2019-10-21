package MarchLongChallenge;

import java.util.Scanner;

public class Medel {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0) {
			int n=s.nextInt();
			int[] a=new int[n];
			int l=10000000;
			int h=0;
			int linedex=0;
			int hindex=0;
			for(int i=0;i<n;i++) {
				a[i]=s.nextInt();
				if(a[i]<l) {
					l=a[i];
					linedex=i;
				}
				if(a[i]>h) {
					h=a[i];
					hindex=i;
				}
			}
			if(linedex < hindex) {
				System.out.println( l + " "+ h);
			}
			else { 
				System.out.println( h + " "+ l);
			}
		}

	}
	
}
