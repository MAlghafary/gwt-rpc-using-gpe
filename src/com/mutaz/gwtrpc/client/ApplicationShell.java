package com.mutaz.gwtrpc.client;

import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.mutaz.gwtrpc.shared.Book;
import com.mutaz.gwtrpc.shared.BooksService;
import com.mutaz.gwtrpc.shared.BooksServiceAsync;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ApplicationShell implements EntryPoint {
	
	private VerticalPanel booksPanel = new VerticalPanel();
	
	@Override
	public void onModuleLoad() {
		RootPanel.get().add(booksPanel);
		BooksServiceAsync service = GWT.create(BooksService.class);
		service.fetchAllBooks(new AsyncCallback<List<Book>>() {
			
			@Override
			public void onSuccess(List<Book> result) {
				for(Book book:result){
					booksPanel.add(new Label(book.toString()));
				}
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());
				
			}
		});
	   
	}
}
