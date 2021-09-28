package com.observerdesign;

public class Main {
	public static void main(String args[]) {
		AajTak<News> subject = new AajTak<>();
		News data = new News();
		NewsChannelFactory factory = new NewsChannelFactory();
		
		Observer observer1 = factory.getNewsChannel(News.NewsType.DELHI_NEWS);
		Observer observer2 = factory.getNewsChannel(News.NewsType.MUMBAI_NEWS);
		Observer observer3 = factory.getNewsChannel(News.NewsType.BUISENESS_NEWS);
		
		String news="Rcb lost the match badly";
		data.setNews(news);
		data.setNewsType(News.NewsType.MUMBAI_NEWS);
		
		subject.register(observer1);
		subject.register(observer2);
		subject.register(observer3);
		
		subject.update(data);
		
	}
}
