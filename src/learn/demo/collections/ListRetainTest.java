package learn.demo.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListRetainTest {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		
		List<Integer> copyOfList1 = new ArrayList<Integer>(list1);
		
		
//		list2.removeAll(list1);
		copyOfList1.removeAll(list2);
		
		
		System.out.println("list1:");
		for (int n : list1) {
			System.out.println(n);
		}
		
		System.out.println("list2:");
		for (int n : list2) {
			System.out.println(n);
		}
		
		System.out.println("copyOfList1:");
		for (int n : copyOfList1) {
			System.out.println(n);
		}
		
		Vector<Integer> vector = new Vector<>();
		
		
		
		
	}
}
