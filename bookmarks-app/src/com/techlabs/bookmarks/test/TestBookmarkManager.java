package com.techlabs.bookmarks.test;

import com.techlab.bookmarks.business.Bookmark;
import com.techlab.bookmarks.presentation.BookmarkMenu;
import com.techlab.bookmarks.service.BookmarkManager;

public class TestBookmarkManager {

	public static void main(String[] args) throws Exception {
		
		BookmarkMenu bookmarkMenu = new BookmarkMenu();
		Bookmark bookmark = bookmarkMenu.getURLDetails();
		BookmarkManager bookmarkManager = new BookmarkManager();
		bookmarkManager.addURL(bookmark);
		bookmarkManager.displayURLs();
		
	}

}
