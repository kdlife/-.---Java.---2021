package varChapter4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class VarAndBigSolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> ints=List.of(2, 10, 5, 7, 8, 4, 6, 7, 0, 1, 1, 1, 1, 1, 1, 1, 1);
 int result = ints.stream()
		 .collect(Collectors.partitioningBy(x->x%2==0))
		 .values()
		 .stream()
		 .max(Comparator.comparing(List::size))
		 .orElse(Collections.emptyList())
		 .stream()
		.mapToInt(Integer::intValue)
		.sum();
 System.out.println("Long Expression"+ result);
 var listInts=List.of(2, 10, 5, 7, 8, 4, 6, 7, 0, 1, 1, 1, 1, 1, 1, 1, 1);
 
 var firstStep=listInts.stream()
		 .collect(Collectors.partitioningBy(x->x%2==0))// групируем на четные и нечетный
		 .values();
 System.out.println(firstStep);
 var secondStep=firstStep.stream()
		 .max(Comparator.comparing(List::size))// выбирает больший список
		 .orElse(Collections.emptyList());
 System.out.println(secondStep);
 var result2=secondStep.stream()
		 .mapToInt(Integer::intValue)
		 .sum();// складываем все значениея
 System.out.println("Long parts Expression"+ result2);
 
		
	}

}
