package com.cttc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		String[] name = {"ssss","ssffff","trttr","yyty","ytyt"};
		for(String n:name)
			System.out.println(n);
		
		System.out.println("-----------------");
		List<String> myList = Arrays.asList(name);
		for(String n:myList)
			System.out.println(n);
		
		//Conversion of List to array..
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		
		Object[] array = intList.toArray();
		for(Object s :array)
			System.out.println(s);
		
		String myName = "Biswaranjan Mohapatra";
		char[] names = myName.toCharArray();
		for(int i=0;i<names.length;i++)
			System.out.print(" "+names[i]);
	}

}
