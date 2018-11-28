package com.gmail.kh;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Input a ");
System.out.println("Input b ");
System.out.println("Input c ");
System.out.println("Input d ");
int a;
a = sc.nextInt();
int b;
b = sc.nextInt();
int c;
c = sc.nextInt();
int d;
d = sc.nextInt();
int max;
 max = a;
 if (b > max  && b > d && b > c ){
	 max= b;
 }
 if (c > max  && c > d ){
	 max= c;
 }
 if (d > max ){
	 max= d;
 }
 System.out.println("Max = " + max);
 	}
	

}
