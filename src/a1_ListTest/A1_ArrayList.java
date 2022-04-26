package a1_ListTest;

import java.util.ArrayList;

public class A1_ArrayList {
	
	public static void main(String[] args) {
		
		// int [] a= new int[5];
		
		ArrayList a= new ArrayList();
		a.add(10); //0
		a.add("Sharmila"); //1
		a.add("Sunaina"); //2
		a.add("Nakul"); //3
		a.add("Ada pongaya"); //4
		a.add("Welcome 2022"); //5
		
		System.out.println(a.get(0));
		System.out.println(a.get(2));

		for (int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		
		
	}

}
