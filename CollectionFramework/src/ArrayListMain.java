import java.util.ArrayList;

import java.util.*;

public class ArrayListMain {

	public static void main(String[] args) {
		
		//ArrayList<String> arraylist = new ArrayList<String>();
		
		List<String> list = new ArrayList<String>();
		
		//Eleman ekleme
		list.add("Java");
		list.add("Python");
		list.add("C++");
		
		//Elemana erişme
		//System.out.println(list.get(0));
		//System.out.println(list.get(1));
		//System.out.println(list.get(2));
		
		System.out.println("***************************");
		
		for(int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		
		System.out.println("***************************");
		
		for(String s : list) {
			
			System.out.println(s);
		}
		
		list.remove(1);
		
		System.out.println("***************************");
		
		for(String s : list) {
			
			System.out.println(s);
		}
	}
}
