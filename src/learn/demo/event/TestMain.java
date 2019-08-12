package learn.demo.event;

import learn.demo.event.core.Event;
import learn.demo.event.info.EventGameEnd;
import learn.demo.event.info.EventGameStart;
import learn.demo.event.info.EventTest;

public class TestMain {
	public static void main(String[] args) {
		
		// 函数调用、函数式接口调用和反射Invoke调用效率对比
		Event.fireEffectiveTest(new EventGameEnd());
		
		EventManager.printCount();
		
		Event.fire(new EventGameStart());
		Event.fire(new EventGameEnd());
		Event.fire(new EventTest());
	}
}
