package PBO_teori;
import java.util.*;
public class No3 {
	

	public static void main(String[] args) {
		int Hasil;
		String Op;
			Scanner keyboard = new Scanner(System.in);
		    Op = keyboard.nextLine();
		    String [] nilai = Op.split(" ");
		    int A = Integer.parseInt(nilai[0]);
		    int B = Integer.parseInt(nilai[2]);
			
			if (A >= 1 && A <= 1000 && B >= 1 && B <= 1000) {
				switch (nilai[1]) {
					case "*" : Hasil = A*B;
					System.out.println(Hasil);
					break; 
		         	case "/" : Hasil = A/B;
		         	System.out.println(Hasil);
		         	break; 
		         	case "+" : Hasil = A+B;
		         	System.out.println(Hasil);
		         	break; 
		         	case "-" : Hasil = A-B;
		         	System.out.println(Hasil);
		         	break; 
		         	case "%" : Hasil = A%B;
		         	
		         	break; 
		         	default : System.out.println("Op tidak ada");
				}
			}
			else 
				 {System.out.println(" tidak diketahui");
		    }
		
	}
}

