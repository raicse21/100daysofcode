package MarchLongChallenge;

import java.util.Scanner;

public class WeaponValue {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0) {
			int n=s.nextInt();
			String[] a = new String[n];
			for(int i=0;i<n;i++)
				a[i]=s.next();
			int[] count= new int[10];
			for(int i=0;i<n;i++) {
				for(int j=0;j<10;j++) {
					if(a[i].charAt(j)=='1') {
						count[j] +=1;
					}
						
				}
			}
			int win=0;
			for(int i=0;i<count.length;i++) {
				if(count[i]%2!=0)
					win++;
			}
			System.out.println(win);
		}
		
	}

}
