package com.BRP_Day_8_Program;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cs = new Scanner(System.in);
        System.out.println("Enter 1st String");
        String string1 = cs.nextLine();

        System.out.println("Enter 2nd String");
        String string2 = cs.nextLine();

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        if (string1.length()!=string2.length()){
            System.out.println("Not Anagram");
        }
        else {
            char[] Str1 = string1.toCharArray();
            char[] Str2 = string2.toCharArray();

            Arrays.sort(Str1);
            Arrays.sort(Str2);

            if (Arrays.equals(Str1,Str2) == true)
                System.out.println("Both the strings are anagram");
            else
                System.out.println("Both the string are not anagram");
        }

	}

}
