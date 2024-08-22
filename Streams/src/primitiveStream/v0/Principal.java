package primitiveStream.v0;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {

		Stream<Integer> stream0 = Stream.of(1, 2, 3);
		System.out.println(stream0.reduce(0, (s, n) -> s + n));
		System.out.println("**********");
		
		Stream<Integer> stream1 = Stream.of(1, 2, 3);
		IntStream ints1 = stream1.mapToInt(x -> x);
		System.out.println(ints1.sum());
		
		System.out.println("**********");
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9);
		
		IntStream ints2 = stream2.mapToInt(x -> x);
		
		IntSummaryStatistics iss = ints2.summaryStatistics();
		
		System.out.println("getAverage: "+iss.getAverage());
		System.out.println("getCount: "+iss.getCount());
		System.out.println("getMax: "+iss.getMax());
		System.out.println("getMin: "+iss.getMin());
		System.out.println("getSum: "+iss.getSum());
		
	}

}
