package com.bridgelabz;

import java.util.Scanner;

public class LineCompressionUC1 {

	public void lineCompare()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x1 ,y1 and x2 ,y2 co-ordinates:");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		
		System.out.print("The 2 points of X and Y co-ordinates are:"+ "("+ x1+","+y1+") ,"+"("+x2+","+y2+")");
		System.out.println();
		//length of line
		double length1=Math.pow(x2-x1, 2);
		double length2=Math.pow(y2-y1, 2);
		double sum=(length1+length2);
		double sq=Math.sqrt(sum);
		System.out.println("The length of line is:"+ sq);
	}
	public static void main(String[] args) {
		LineCompressionUC1 obj=new LineCompressionUC1();
		obj.lineCompare();
	}
}
