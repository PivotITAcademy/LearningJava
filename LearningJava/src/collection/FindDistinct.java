package collection;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = List.of(1,2,3,4,5,6,7,7,2,8,9,1);
		
		List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinct.toString());
	}

}
