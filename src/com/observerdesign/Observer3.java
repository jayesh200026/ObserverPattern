package com.observerdesign;

public class Observer3<T> implements Observer<T>{
	@Override
	public <T>void onUpdate(T data) {
		if(data instanceof Data) {
			System.out.println(((Data)data).getData());
		}
	}

}
