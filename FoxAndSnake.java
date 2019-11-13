import java.util.Scanner;

public class FoxAndSnake {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		boolean cond = true;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				for(int j=0;j<m;j++)
					System.out.print("#");
				System.out.println();
			}
			if(i%2!=0 && cond) {
				for(int k=0;k<m-1;k++)
					System.out.print(".");
				System.out.println("#");
				cond = !cond;
			}else if(i%2!=0 && !cond){
				System.out.print("#");
				for(int l=0;l<m-1;l++)
					System.out.print(".");
				System.out.println();
				cond = !cond;
			}

		}

	}

}
