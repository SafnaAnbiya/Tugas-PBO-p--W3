package PBO_teori;

import java.util.*;

public class No4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Gaji=500000;
		int Ijual;
		int Bonus=0;
		int Denda=0;
		int Iharga=50000;
			Ijual =input.nextInt();
				if  (Ijual >= 40 && Ijual < 80) {
					Bonus = Ijual * Iharga *25/100;
					Gaji  =	Gaji  + Bonus;
					System.out.println(Gaji);
				}
				else if	(Ijual >= 80) {
					Bonus = Ijual * Iharga *35/100;
					Gaji  = Gaji  + Bonus;
					System.out.println(Gaji);
				}
				else if (Ijual < 15) {
					Denda =(15 - Ijual)*Iharga *15/100;
					Gaji  = Gaji - Denda;
					System.out.println(Gaji);
				}
				else {
					Bonus = Ijual * Iharga *10/100;
					Gaji = Gaji + Bonus;
					System.out.println(Gaji);
			}	
	}

}
