package com.app;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
@ComponentScan(basePackages="com.app")
public class AppConfig {
	
	@Bean
	public JavaMailSenderImpl sender(){
		
		JavaMailSenderImpl mail =new JavaMailSenderImpl();
		mail.setHost("smtp.gmail.com");
		mail.setPort(587);
		mail.setUsername("rajanna0507@gmail.com");
		mail.setPassword("9553868348");
		mail.setJavaMailProperties(mailprop());
		return mail;
		
	}
	
	public Properties mailprop(){
		Properties p=new Properties();
		p.put("mail.smtp.auth", true);
		p.put("mail.smtp.starttls.enable",true);
		
		return p;
		
		
		
		
	

}
}