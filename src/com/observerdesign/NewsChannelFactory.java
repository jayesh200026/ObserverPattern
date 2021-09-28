package com.observerdesign;

public class NewsChannelFactory {
	
	public Observer getNewsChannel(News.NewsType channel) {
		
		switch(channel) {
				case MUMBAI_NEWS:
					break;
				case DELHI_NEWS:
					break;
				case BUISENESS_NEWS:
					break;
		}
		
		return null;
	}

}
