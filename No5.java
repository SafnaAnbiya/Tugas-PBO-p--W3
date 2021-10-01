package PBO_teori;
import java.util.*;
public class No5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomor;
		Scanner input = new Scanner(System.in);
		String No_police = input.nextLine();
		String Value = No_police.replaceAll ("\\s", "");
		 if((Long.parseLong(Value) - 999999) % 5 == 0){
	            System.out.println("Jalan");
	        }
	        else{
	            System.out.println("Berhenti");
		
	}

}
}
