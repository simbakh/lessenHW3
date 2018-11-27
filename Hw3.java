package com.gmail.kh;

import java.util.Scanner;

public class Hw3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int a = sc.nextInt();
		if (a%4 == 0  && a%400==0)
		{
			System.out.println("It's a leap-year");
		}
		else 
		{
			System.out.println("It's a non-leap year");
		}

}
	}
