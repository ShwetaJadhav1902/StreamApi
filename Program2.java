package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program2 {
	public static void main(String[] args) {
		List<Integer>list1=Arrays.asList(23,34,56,76,54,54);
		
		Stream<Integer>s=list1.stream();
		
		List<Integer>even=s.filter(i->i%2==0).collect(Collectors.toList());
		
		for(Integer i:even) {
			System.out.println(i);
		}

	}

}
