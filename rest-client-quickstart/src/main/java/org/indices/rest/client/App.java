package org.indices.rest.client;

import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@OpenAPIDefinition(//
	    tags = { //
	        @Tag(name = "worldbank", description = "Consumo de dados de índices do Banco Mundial."), //
	        @Tag(name = "indicators", description = "Indicadores econômicos extraídos do Banco Mundial.")//
	    }, //
	    info = @Info(//
	        title = "API de consumo de dados de índices do Banco Mundial", //
	        version = "1.0.0", //
	        contact = @Contact(//
	            name = "Gilberto Almeida", //
	            url = "https://github.com/gilbertoasz87")), //
	    servers = { //
	        @Server(url = "http://localhost:8080")//
	    }) //
public class App extends Application{

}
