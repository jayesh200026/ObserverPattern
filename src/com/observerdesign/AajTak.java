package com.observerdesign;

import java.util.ArrayList;
import java.util.List;

public class AajTak<T> {
	List<Observer> observerList = new ArrayList<>();
	
	public void register(Observer observer) {
		observerList.add(observer);
	}
	
	public void unRegister(Observer observer) {
		observerList.remove(observer);
	}
	
	public <T>void update(T news) {
		for (Observer observer : observerList) {
			if(observer.getRequiredNewsType()==((News)news).getNewsType()) {
				observer.onUpdate(news);
			}
		}
		
	}
}
