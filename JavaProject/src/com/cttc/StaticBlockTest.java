package com.cttc;

public class StaticBlockTest {
	static int a = 20;
	int b = 30;

	void show() {
		System.out.println("b = " + b);
	}

	static {
		System.out.println("I am in static block");
		System.out.println("a = " + a);
	}

	public static void main(String[] args) {
		StaticBlockTest sb = new StaticBlockTest();
		sb.show();
	}

}
