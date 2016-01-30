package com.test.di;

public class HelloWorldCon {
	private TextMessage message;
	private String localMsg ;


	public HelloWorldCon(TextMessage message, String localMsg) {
		this.message = message;
		this.localMsg = localMsg;
	}
	
	
	public void sayMessage(){
		
		System.out.println(message.getMsg() + " : " + localMsg);
		
	}
	
}