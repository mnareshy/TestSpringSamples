package com.test.di;

public class HelloWorld {
	private TextMessage message;

	/*public TextMessage getMessage() {
		return message;
	}*/
	public void setMessage(TextMessage message) {
		this.message = message;
	}
	
	
	public void sayMessage(){
		
		System.out.println(message.getMsg());
		
	}
	
}