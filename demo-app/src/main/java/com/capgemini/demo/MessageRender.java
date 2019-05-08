package com.capgemini.demo.render;
import com.capgemini.demo.provider.*;

public class MessageRender{

	public static MessageProvider provider;

	public void setMessageProvider(MessageProvider provider){
		this.provider=provider;
	}

	public void displayMessage(){
		System.out.println(provider.getMessage());
	}
}