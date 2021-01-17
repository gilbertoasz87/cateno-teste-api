package org.indices.rest.client;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/country")
public class CountriesResource {

    @Inject
    @RestClient
    CountriesService countriesService;

    @GET
    @Operation(summary = "Retorna todos os países cadastrados no Banco Mundial")
    @APIResponse(responseCode = "200", //
        content = @Content(//
            mediaType = MediaType.APPLICATION_JSON, //
            schema = @Schema(//
                implementation = List.class, //
                type = SchemaType.ARRAY)))
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Object> getAll() {
    	List<Object> countries = (List<Object>) countriesService.getAll("json")[1];
        return countries;
    }
    
    @GET
    @Path("/indicator/pov/{code}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Object> getIndicatorPOVByCountry(
    	    @Parameter(description = "Código do país a ser pesquisado o índice POV", required = true) //
    		@PathParam("code") String code) {
    	List<Object> indice = (List<Object>) countriesService.getIndicatorPOV(code,"json")[1];
        return indice;
    }


}
