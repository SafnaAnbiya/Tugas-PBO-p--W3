package PBO_teori;

import java.util.*;

public class No2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
	    System.out.println("================================");
	        for(int i=0;i<3;i++)
	        {
	            String x=scan.next();
	            int y=scan.nextInt();
	            System.out.printf("%-15s%03d%n",x,y);
	        }
	    System.out.println("================================");
	    scan.close();
	}

}