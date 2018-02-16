package com.mutaz.gwtrpc.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface BooksServiceAsync {
	void fetchAllBooks(AsyncCallback<List<Book>> callback);
}
