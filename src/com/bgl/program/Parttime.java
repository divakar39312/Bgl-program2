package com.bgl.program;

public class Parttime {
	public static void main(String[] args) {
		int isparttime=1;
		int isfulltime=2;
		int emprateperhr=20;
		int empHr=0;
		int empwage=0;
		double empCheck=Math.floor(Math.random()*10)%3;
	   if(empCheck==isparttime)
		   empHr=4;
	   else if(empCheck==isfulltime)
		   empHr=8;
	   else
		   empHr=0;
	   empwage=empHr*emprateperhr;
	   System.out.println("empWage"+empwage);
	
	
	}

}
