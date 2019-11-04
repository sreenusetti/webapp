/*package com.app;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailSender;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext c=new AnnotationConfigApplicationContext(AppConfig.class);
		MailSender m=(MailSender)c.getBean("sender()");
		
		FileSystemResource f=new FileSystemResource("C:\\Users\\dell\\Desktop\\maxresdefault.jpg");
boolean flag=m.sendEmail("rajanna0508@gmail.com", "Hello Test", "welcome to Email App", f);
		if(flag)
			 System.out.println("done");
		else
			System.out.println("fail");
		
		
		
		
		
	}

}
*/



package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.core.io.FileSystemResource;

import com.app.AppConfig;
import com.app.util.AppMailSender;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext c=new AnnotationConfigApplicationContext(AppConfig.class);
		AppMailSender mailsender=(AppMailSender)c.getBean("appMailSender");
		
		FileSystemResource file=new FileSystemResource("D:\\hummingbird\\bird-birds-349758.jpeg");
		boolean flag=mailsender.sendEmail("uruturu.prasad19@gmail.com", "Hello Test", "welcome to Email App", file);
		if(flag)
			 System.out.println("done");
		else
			System.out.println("fail");
		
		
		
		
	}
}
