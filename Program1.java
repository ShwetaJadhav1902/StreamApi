package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Program1 {
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(23,34,56,76,54,54);
	
	for(Object l:list) {
		System.out.println(l);
		
	}
	System.out.println("-------------------------------------------------------");
	
	
	ArrayList<Integer>arr=new ArrayList<>();
	arr.add(78);
	arr.add(56);
	arr.add(80);
	arr.add(54);
	arr.add(45);
	
	for(Object l:arr) {
		System.out.println(l);
	}
	
	System.out.println("--------------------------------------------------------------");
	
	ArrayList<Integer> evenList=new ArrayList<Integer>();
	for(Integer l:list) {
		if(l%2==0) {
			evenList.add(l);
		}
	}
	for(Object l:evenList) {
		System.out.println(l);
	}
	
}
}