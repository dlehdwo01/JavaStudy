package day13;

import java.util.Vector;

public class MyStack<T> implements IStack {
	Vector<Object> v = new Vector<Object>();

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		Object re = v.get(v.size() - 1);
		v.remove(v.size() - 1);
		return re;

	}

	@Override
	public boolean push(Object ob) {
		// TODO Auto-generated method stub
		v.add(ob);
		return false;
	}

	public static void main(String[] args) {

		MyStack<Object> A = new MyStack<>();
		A.push(1);
		A.push(5);
		A.push(7);
		A.push(3);
		System.out.println(A.pop());
		System.out.println(A.pop());
		System.out.println(A.pop());
		System.out.println(A.pop());

	}
}
