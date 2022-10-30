package com.bridgelabz;

import java.util.Scanner;

public class LineCompressionUC1 {

	//uc3---Length of line is equal or not using compareTo
	public void lineCompare()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter co-ordinates for Line1:");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		System.out.println("Enter co-ordinates for Line2:");
		int m1=sc.nextInt();
		int n1=sc.nextInt();
		int m2=sc.nextInt();
		int n2=sc.nextInt();
		
		//calculate length for line 1
		double power1=Math.pow(x2-x1, 2);//square
		double power2=Math.pow(y2-y1, 2);
		double sum1=(power1+power2);
		double sq1=Math.sqrt(sum1);
		System.out.println("The Length of Line 1 is :"+ sq1);
		String a1=String.valueOf(sq1);
		
		//calculate length for line 2
		double power3=Math.pow(m2-m1, 2);
		double power4=Math.pow(n2-n1, 2);
		double sum2=(power3+power4);
		double sq2=Math.sqrt(sum2);
		System.out.println("The Length of Line 2 is:"+ sq2);
		String a2=String.valueOf(sq2);// String.valuOf is used to conv double to string
		
		//equating both the lines
		
	//	System.out.println(a1.compareTo(a2));//0
		
		if(a1.compareTo(a2)>0)
		{
			System.out.println("Line 1 is greater than Line 2");
		}
		else if(a1.compareTo(a2)<0)
		{
			System.out.println("Line 1 is less than Line 2");
		}
		else // prints 0 means equal
		{
			System.out.println("Both Line 1 and Line 2 are equal");
		}
}
	public static void main(String[] args) {
		LineCompressionUC1 obj=new LineCompressionUC1();
		obj.lineCompare();
	}
}
