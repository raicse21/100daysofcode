import java.util.Scanner;

public class PashmakAndGarden {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int x1=s.nextInt();
		int y1=s.nextInt();
		int x2=s.nextInt();
		int y2=s.nextInt();
		int x3=0;
		int y3=0;
		int x4=0;
		int y4=0;
		int dx = x1 - x2;
	    int dy = y1 - y2;
	    if (dx != 0 && dy != 0)
	    {
	        x3 = x1;
	        y3 = y2;
	        x4 = x2;
	        y4 = y1;
	    }

	    else if (dx != 0)
	    {
	        x3 = x1;
	        y3 = y1 + Math.abs(dx);
	        x4 = x2;
	        y4 = y2 + Math.abs(dx);
	    }
	    else
	    {
	        x3 = x1 + Math.abs(dy);
	        y3 = y1;
	        x4 = x2 + Math.abs(dy);
	        y4 = y2;
	    }

	    if (dx != 0 && dy != 0 && Math.abs(dx) != Math.abs(dy))
	    	System.out.println(-1);
	    else
	       System.out.println(x3+" "+y3 + " "+ x4 + " "+ y4);    
	}

}
