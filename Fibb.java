package com.core.test;

import java.util.Scanner;

public class Fibb {
	
	 public static void main(String []args){
	        int n1=0,n2=1,n3,i,count;
	        System.out.println("enter a maximum number");
	        Scanner sc=new Scanner(System.in);
	        count=sc.nextInt();
	        System.out.print(n1+" "+n2);
	        for(i=3;i<=count;i++) {
	        	n3=n1+n2;
	        	System.out.print(" "+n3);
	        	n1=n2;
	        	n2=n3;
	        }
	        	        
	     }

}
