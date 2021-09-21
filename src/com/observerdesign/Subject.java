package com.observerdesign;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	List<Observer> observerList = new ArrayList<>();
	
	public void register(Observer observer) {
		observerList.add(observer);
	}
	
	public <T>void update(T data) {
		for (Observer observer : observerList) {
			observer.onUpdate(data);
		}
		
	}
}
