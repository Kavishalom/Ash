package org.test;

public class Array {

	public static void main(String[] args) {
		//Data Type variable [] = new Datatype [length]
		
		int a[] = new int [6];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		a[5]=70;
		
		System.out.println(a[5]);
	
	//find the length of array
	
		int len = a.length;
	System.out.println(len);	
		
	//iteration of the Array
	for (int i = 0; i < 3; i++) {
		 
		System.out.println(a[i]);
		
	}
	}
}
