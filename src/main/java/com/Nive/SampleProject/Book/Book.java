package com.Nive.SampleProject.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book {
		
@Autowired	
private StoryBook storybook;
@Autowired
private FictionBook fictionbook;
public void dis() {
	System.out.println("Book success");
}
public void run() {
	storybook.disp1();
	fictionbook.dis2();
	
	
}
}
