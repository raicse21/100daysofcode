import java.util.Scanner;

public class DubStep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str =s.next();
		boolean flag=false;
		for(int i=0;i<str.length();i++) {
			if((i+2)<str.length() && str.charAt(i)=='W' && str.charAt(i+1)=='U' && str.charAt(i+2)=='B'){
				i+=2;
				if(flag) {
					System.out.print(" ");
					flag=false;
				}
			}else {
				System.out.print(str.charAt(i));
				if(!flag) {
					flag=  true;
				}
			}
		}
	}

}
