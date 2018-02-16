/*
 * Like the DTO , the service is used by both the client side and the server side. So this
   class must reside in a directory that will be compiled to JavaScript by the GWT compiler.
 */
package com.mutaz.gwtrpc.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/*
 * When GWT compiles the code to JavaScript and turns the service into an Ajax
call, it needs to know the location of the servlet on the server. The @RemoteService-
RelativePath annotation allows you to do this. The value, "service" in this case, is
appended to the result of GWT.getModuleBaseURL() . The URL that this translates to
depends on where you deploy the compiled GWT code on your server. Most of the
time this will make sense, but there are always exceptions. Because of this, this annota-
tion is optional and can be specified when you write the client-side code. We’ll look at
that more in section 7.6, but for now it suits our purposes to use the annotation.

Your service needs to extend RemoteService . This is another one of those
marker interfaces, as you saw earlier when we looked at IsSerializable , and it
doesn’t require you to implement any additional methods. The purpose of this inter-
face is to trigger the generation of the code by the GWT compiler that will do the real
work of allowing you to (somewhat) transparently call your server-side service.

You need to define the server-side service that you’ll implement. No additional rules
apply here other than what we already defined. Specifically, all of the parameters,
return types, and exceptions need to be compatible with GWT serialization. The GWT
compiler will inspect this method during code-generation time in order to know what
type serializers must be included in the resulting JavaScript output.
For this same reason it’s important to be as specific as possible when specifying the
types, because this will result in code bloat. For example, specifying that this method
throws Exception , as opposed to GTwitterException , requires the generated code to
include every available Exception type. So instead of only GTwitterException , the
compiled code would include closer to 30 exception types and the code to serialize all
of them.


 */
@RemoteServiceRelativePath("books")
public interface BooksService extends RemoteService{
	
    List<Book> fetchAllBooks();

}
