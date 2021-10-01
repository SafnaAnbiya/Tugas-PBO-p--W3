package PBO_teori;

import java.io.*;
import java.util.*;
import java.util.regex.*; 
public class No1 {

    public static void main(String[] args) {
    	System.out.println("Input Kalimat : ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String[] splitString = (s.replaceAll("^[\\W+\\s+]", "").split("[\\s!,?._'@]+"));
            System.out.println(splitString.length);
            for (String tokens : splitString) {
                System.out.println(tokens);
              }
}
}

