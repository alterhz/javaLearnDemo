package learn.demo.steam;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class TestSteam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 19, 23, 29);
		
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		
		System.out.println("highest:" + stats.getMax());
		System.out.println("lowest:" + stats.getMin());
		System.out.println("sum:" + stats.getSum());
		System.out.println("average:" + stats.getAverage());
		System.out.println("count:" + stats.getCount());
		
		
	}

}
