package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeannsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(BeannsApplication.class, args);
		MyBean aliens=ctx.getBean(MyBean.class);
		aliens.show();
		MyBean aliens1=ctx.getBean(MyBean.class);
		aliens.show();
	}

}
