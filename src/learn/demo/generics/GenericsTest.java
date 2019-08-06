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
		
		List<?> l3 = new LinkedList<Integer>();
		
//		l2.add("ttt");
//		
//		l3.add(1);
		
		l3.get(0);
		l3.remove(0);
		
	}
	
}
