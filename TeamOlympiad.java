import java.util.ArrayList;
import java.util.Scanner;

public class TeamOlympiad {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int one =0;
		int two=0;
		int three=0;
		int[] a=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		ArrayList<Integer> lone = new ArrayList<>();
		ArrayList<Integer> ltwo = new ArrayList<>();
		ArrayList<Integer> lthree = new ArrayList<>();

		for(int j=0;j<a.length;j++) {
			if(a[j]==1) {
				one ++;
				lone.add(j+1);
			}
			if(a[j]==2) {
				two ++;
				ltwo.add(j+1);
			}
			if(a[j]==3) {
				three ++;
				lthree.add(j+1);
			}
		}
		int w = Math.min(Math.min(one,two),three);
		System.out.println(w);
		for(int i=0;i<w;i++) {
			System.out.println(lone.get(i) + " " + ltwo.get(i) + " " + lthree.get(i));
		}
	}
}
