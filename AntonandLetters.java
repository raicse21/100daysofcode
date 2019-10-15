import java.util.HashMap;
import java.util.Scanner;

public class AntonandLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String str = s.nextLine();
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if( (int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
				map.put(str.charAt(i),1);
			}
		}
		System.out.println(map.size());
	}

}
