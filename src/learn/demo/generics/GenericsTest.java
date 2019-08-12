package learn.demo.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class GenericsTest {
	
	public static void main(String[] args) {
		MyT<? extends A> myT = null;
		
		myT = new MyT<A1>(new A1());
		
		Map<Integer, MyT<? extends A>> testMap = new HashMap<Integer, MyT<? extends A>>();
		
		testMap.put(1, new MyT<A1>(new A1()));
		testMap.put(2, new MyT<A2>(new A2()));
		
		MyT<? extends A> tempMyT1 = testMap.get(1);
		tempMyT1.getT().print();
		
		MyT<? extends A> tempMyT2 = testMap.get(2);
		tempMyT2.getT().print();
		
		
		////////////////////////////////
		// ！！！ 使用通配符，不能加入新数据，只能获取和删除。
		List<String> l1 = new ArrayList<String>();
		l1.add("member");
		
		List<?> l2 = l1;
		
		System.out.println("l2:index:0=" + l2.get(0));

		// [!!!]通配符类型不能进行添加操作
//		l2.add("ttt");
		
		@SuppressWarnings("unchecked")
		List<String> l4 = (List<String>)l2;
		l4.add("mmm");
		
		System.out.println("l2:");
		for (int i=0; i<l2.size(); ++i) {
			System.out.println(l2.get(i));
		}
		
		List<?> l3 = new LinkedList<Integer>();
		
		// [!!!]通配符类型不能进行添加操作
//		l3.add(8);
		
//		l3.get(0);
//		l3.remove(0);
		
		
		
	}
	
}
