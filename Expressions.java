import java.util.Scanner;

public class Expressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int exp1=a+b+c;
		int exp2=a*b*c;
		int exp3=a+b*c;
		int exp4=a*b+c;
		int exp5=a*(b+c);
		int exp6=(a+b)*c;
		
		System.out.println( Math.max(exp1,Math.max(exp2, Math.max(exp3, Math.max(exp4, Math.max(exp5, exp6))))));
		
	}
}