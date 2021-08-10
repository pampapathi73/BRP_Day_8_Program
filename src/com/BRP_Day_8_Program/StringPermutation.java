package com.BRP_Day_8_Program;

import java.util.Scanner;
public class StringPermutation {

	public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = cs.nextLine();
        
        int len = str.length();
        System.out.println("All the permutation of the string are : ");
        generatePermutation(str,0,len);
    }

    private static void generatePermutation(String str, int start, int end) {
        if (start == end-1)
            System.out.println(str);
        else {
            for (int i=start;i<end;i++){
                str = swapString(str,start,i);
                generatePermutation(str,start+1,end);
                str = swapString(str,start,i);
            }
        }
    }

    private static String swapString(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }
}