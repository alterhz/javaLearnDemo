package learn.demo.generics;

public class MyT<T extends A> {
	T t = null;
	
	public MyT(T t) {
		this.t = t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}

	public void print() {
		t.print();
	}
}
