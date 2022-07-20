package com.bgl.program;

public class Welcome {
public static void main(String[] args) {
	System.out.println("welcome to Employee wage computation program");
	
	int isfulltime=1;
	double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==isfulltime) 
			System.out.println("Employee is present");
			else
				System.out.println("employee is absent");
		
		
}
}
