package com.lonphy.adapterpattern.test;

import java.util.Enumeration;

import org.junit.Test;

import com.lonphy.adapterpattern.example3.BookNameList;
import com.lonphy.adapterpattern.example3.IteratorAdapter;
import com.lonphy.adapterpattern.example3.NewBookNameList;

public class Example3Test {
	@Test
	public void testMain() {
		BookNameList oldBookList = new BookNameList();
		oldBookList.setBookNames();
		Enumeration bookEnum = oldBookList.getEnumeration();
		IteratorAdapter adapter = new IteratorAdapter(bookEnum);
		NewBookNameList newBookList = new NewBookNameList(adapter);
		newBookList.setBookName();
		System.out.println("导入到新系统中的图书列表：");
		newBookList.getBookName();
	}
}
