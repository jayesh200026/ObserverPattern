package com.observerdesign;

import com.observerdesign.News.NewsType;

public class MumbaiAajTak<T> implements Observer<T>{
	@Override
	public <T>void onUpdate(T data) {
		if(data instanceof News) {
			System.out.println(((News)data).getNews());
		}
	}

	@Override
	public NewsType getRequiredNewsType() {
		
		return NewsType.MUMBAI_NEWS;
	}

}
