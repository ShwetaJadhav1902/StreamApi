package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program3 {
	public static void main(String[] args) {
		//List<Integer>list1=Arrays.asList(25,34,56,75,54,50);
		List<Integer>list1=Arrays.asList(2,3,6,7,4,5);
		
		Stream<Integer>s=list1.stream();
		
	//	List<Integer>even=s.filter(i->i%5==0).collect(Collectors.toList());
		List<Integer>even=s.map(n->n*n).collect(Collectors.toList());
		for(Integer i:even) {
			System.out.println(i);
		}

	}

}
