import java.util.Scanner;

public class llyaAndBankAccount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>=0) {
			System.out.println(n);
		}else {
			System.out.println(Math.max(n/10, 10*(n/100) + (n%10)));
		}
	}

}
