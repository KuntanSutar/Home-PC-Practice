package com.techlab.bookmarks.presentation;

import java.util.Scanner;

import com.techlab.bookmarks.business.Bookmark;

public class BookmarkMenu {
	// Presentation : Switch Case
	// No Test Class
	String name;
	String url;
	
	public Bookmark getURLDetails() {
		
		System.out.println("Enter URL Name : ");
		System.out.println("Enter URL Link : ");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		url = sc.nextLine();
		sc.close();
		Bookmark b1 = new Bookmark();
		b1.setName(name);
		b1.setUrl(url);
		return b1;
		
	}

}
