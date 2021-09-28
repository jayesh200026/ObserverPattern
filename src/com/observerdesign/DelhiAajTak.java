package com.observerdesign;

import com.observerdesign.News.NewsType;

public class DelhiAajTak<T> implements Observer<T>{
	
	@Override
	public <T>void onUpdate(T data) {
		if(data instanceof News) {
			System.out.println(((News)data).getNews());
		}
		
	}

	@Override
	public NewsType getRequiredNewsType() {
		// TODO Auto-generated method stub
		return NewsType.DELHI_NEWS;
	}
	
}
