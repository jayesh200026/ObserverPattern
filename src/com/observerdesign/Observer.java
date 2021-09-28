package com.observerdesign;
import com.observerdesign.News.NewsType;;


public interface Observer<T> {
	public <T>void onUpdate(T data) ;
	
	public NewsType getRequiredNewsType();
		
}
