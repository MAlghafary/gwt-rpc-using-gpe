/*
This class lives in the server package of your project. Specifically, the rule is that
this class can live in any package not compiled to JavaScript by the GWT compiler. The
reason is that server-side GWT-RPC code uses classes outside of the JRE Emulation
Library and therefore is unable to be compiled to JavaScript.
*/
package com.mutaz.gwtrpc.server;

import java.util.Arrays;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.mutaz.gwtrpc.shared.Book;
import com.mutaz.gwtrpc.shared.BooksService;

/*
 * When you define the class, you need to extend RemoteServiceServlet . This is
   The GWT servlet that handles the incoming request from the client, deserializes the
   incoming data, and executes your method.
 */
public class BooksServiceImpl extends RemoteServiceServlet implements BooksService{

	@Override
	public List<Book> fetchAllBooks() {
	    List<Book> books = Arrays.asList(
	    		new Book(1, "Effective Java", "Jashua block"),
	    		new Book(2,"Core Java Volume I","someone"));
	    
	    return books;
	}

}
