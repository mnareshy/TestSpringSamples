package com.test;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCache {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/ApplicationContext.xml");
		
/*		CacheManager cacheManager = (CacheManager) context.getBean("cacheManager");
		
		Cache cache = cacheManager.getCache("terst");*/
		

		TransactionBO tbo = (TransactionBO) context.getBean("transactionBO");
		System.out.println(tbo.save());
		
	}

}
