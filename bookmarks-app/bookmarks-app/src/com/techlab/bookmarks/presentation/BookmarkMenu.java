package com.techlab.bookmarks.presentation;

import java.util.Scanner;

import com.techlab.bookmarks.business.Bookmark;
import com.techlab.bookmarks.service.BookmarkManager;

public class BookmarkMenu {
	// Presentation 
	// No Test Class
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter URL Name : ");
		System.out.println("Enter URL Link : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String url = sc.nextLine();
		sc.close();
		Bookmark bookmark = new Bookmark();
		bookmark.setName(name);
		bookmark.setUrl(url);
		BookmarkManager bookmarkManager = new BookmarkManager();
		bookmarkManager.addURL(bookmark);
		bookmarkManager.displayURLs();
		
	}

}
