package MarchLongChallenge;

import java.util.HashMap;
import java.util.Scanner;

public class HardSequence {

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		int[] a = new int[128];
		int[] b = new int[128];
		a[0]=0;
		a[1]=0;
		b[a[0]]=0;
		HashMap<Integer,Boolean> map = new HashMap<>();
		map.put(0, true);
		for(int i=2;i<a.length;i++) {
			if(map.containsKey(a[i-1])) {
				int val = i -1 - b[a[i-1]];
				b[a[i-1]] =i-1;
				a[i]=val;
			}else {
				map.put(a[i-1], true);
				b[a[i-1]] = i-1;
				a[i]=0;	
			}	
		}
		int t=s.nextInt();
		while(t-->0) {
			int n=s.nextInt();
			int count =0;
			int val = a[n-1];
			for(int i=0;i<n;i++) {
				if(a[i]==val)
					count++;
			}
			System.out.println(count);
		}
		
	}

}
