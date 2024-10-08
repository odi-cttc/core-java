package com.cttc;

public class TypeCastingTest {

	public static void main(String[] args) {
		int a = 9;
		System.out.println(a/2.0);//Implicit Type Casting
		System.out.println((float)a/2);//Explicit Type Casting
		System.out.println(a/(float)2);//Explicit Type Casting
	}

}
