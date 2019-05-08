package com.capgemini.demo.test;
import com.capgemini.demo.render.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App{
	public static void  main(String args[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml"); 
		MessageRender render=(MessageRender)context.getBean("render");
		render.displayMessage();
	}
}