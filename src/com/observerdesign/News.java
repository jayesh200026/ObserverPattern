package com.observerdesign;

public class News {
	public enum NewsType{
		MUMBAI_NEWS,DELHI_NEWS,BUISENESS_NEWS
	}
	
	
	String news;
	NewsType newsType;
	
	public NewsType getNewsType() {
		return newsType;
	}

	public void setNewsType(NewsType newsType) {
		this.newsType = newsType;
	}

	News(){
		
	}
	
	public String getNews() {
		return news;
	}
	
	public void  setNews(String news) {
		this.news= news;
	}
	

	@Override
	public String toString() {
		return "Data [data=" + news + "]";
	}
	
	

}
