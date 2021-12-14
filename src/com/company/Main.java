package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter number:");
        Scanner x= new Scanner(System.in);
        int i=x.nextInt();
        String b=Integer.toBinaryString(i);
        String o=Integer.toOctalString(i);
        String h=Integer.toHexString(i);
        System.out.println("Given number:"+i);
        System.out.println("binary equivalent:"+b);
        System.out.println("Octal equivalent:"+o);
        System.out.println("hex equivalent:"+h);
    }
}
