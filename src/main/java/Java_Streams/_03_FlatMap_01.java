package Java_Streams;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _03_FlatMap_01 {

	public static void main(String[] args) {
		
		// map()
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2 = new ArrayList<Integer>();

		list2=	list1.stream().map(n->n+10).collect(Collectors.toList());
	//	System.out.println(list2);
		
		//flatMap()
		List<Integer> liste1 = Arrays.asList(1,2);
		List<Integer> liste2 = Arrays.asList(3,4);
		List<Integer> liste3 = Arrays.asList(5,6);
		
		
		List<List<Integer>> finaList = Arrays.asList(liste1,liste2,liste3);
		List<Integer> finalResultsList = finaList.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());

		System.out.println(finalResultsList); //[11, 12, 13, 14, 15, 16]

		

		
		
		
		
		
		

	}

}
