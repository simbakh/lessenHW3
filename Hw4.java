package com.gmail.kh;

import java.util.Scanner;

public class Hw4 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter (a) side");
	int a = sc.nextInt();
	System.out.println("Enter (b) side");
	int b = sc.nextInt();
	System.out.println("Enter (c) side");
	int c = sc.nextInt();
	if ((a+b)>c && (c+b)>a && (a+c)>b )
	{
		System.out.println("It's a triangle");
	}
	else 
	{
		System.out.println("It's not a triangle");
	}
	}

}
