package org.indices.rest.client;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/v2")
@RegisterRestClient
public interface CountriesService {

    @GET
    @Path("/country/all")
    Object[] getAll(@QueryParam("format") @DefaultValue("json") String format);
    
    @GET
    @Path("/country/{code}/indicator/SI.POV.DDAY")
    Object[] getIndicatorPOV(@PathParam("code") String code,
    		@QueryParam("format") @DefaultValue("json") String format);


}
