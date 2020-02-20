package learn.demo.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, Integer> myMap = new HashMap<>();
		
		for (int i=1; i<10; ++i) {
			final int n = i;
			if (null == myMap.computeIfPresent(1, (k, v) -> v + n)) {
				myMap.put(1, n);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
