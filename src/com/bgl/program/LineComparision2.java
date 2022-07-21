package com.bgl.program;

public class LineComparision2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("welcome to line comparision");
		/*
		 * equality of two lines
		 */
		
		int x1=8;
		int x2=8;
		int y1=7;
		int y2=7;
		int x3=6;
		int x4=6;
		int y3=7;
		int y4=7;
		
		double distanceofline1=(Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)));
		double distanceofline2=(Math.sqrt(Math.pow(x4-x3, 2)+Math.pow(y4-y3, 2)));
	   System.out.println("the length of first line (x2-x1)+(y2-y1)"+distanceofline1);
	   System.out.println("the length of first line (x4-x3)+(y4-y3)"+distanceofline2);
	   Integer obj1=new Integer((int)distanceofline1);
	   Integer obj2=new Integer((int)distanceofline2);
	   System.out.println("these line are equal"+""+obj1.equals(obj2));
	}

}
