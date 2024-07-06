package com.xxl.sso.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author xuxueli 2018-03-22 23:41:47
 */
@SpringBootApplication
public class XxlClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(XxlClientApplication.class, args);

		//容器里的组件
		for(String name:con.getBeanDefinitionNames())
		{
			System.out.println(name);
		}
	}

}
