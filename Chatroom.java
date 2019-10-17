import java.util.Scanner;

public class Chatroom {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String str = s.next();
		String ans="hello";
		int j=0;
		
		if(str.length()>=5) {
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==ans.charAt(j)) {
					j++;
				}
				if(j==5) {
					System.out.println("YES");
					break;
				}
			}
			if(j!=5) {
				System.out.println("NO");
			}
		}else {
			System.out.println("NO");
		}


	}

}
