package com.Nive.SampleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.Nive.SampleProject.Book.Book;

@SpringBootApplication
@ComponentScan("com.Nive.SampleProject.Book")
public class Practice1Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(Practice1Application.class, args);
	Book b=context.getBean(Book.class);
	b.run();
	b.dis();
	
	}

}
