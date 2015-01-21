package com.uhg.myuhc.webresources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * Root resource (exposed at "helloworld" path)
 */
@Path("helloworld")
public class FirstRESTService {
    @Context
    private UriInfo context;
 
    /** Creates a new instance of FirstRESTService */
    public FirstRESTService() {
    }
 
    /**
     * Retrieves representation of an instance of FirstRESTService
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    public String getHtml() {
        return "<html lang=\"en\"><body><h1>Hello, from a REST Service in the OSE World!!</h1></body></html>";
    } 
}