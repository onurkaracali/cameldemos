package com.cd.web.routing;

import javax.xml.bind.JAXBContext;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;

import com.cd.web.dto.HelloInputDTO;
import com.cd.web.dto.HelloOutputDTO;

public class CamelRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		JaxbDataFormat jaxb = new JaxbDataFormat();
		jaxb.setContextPath("com.cd.web.dto");
		
		
		// routing
		
		
		from("cxf:/hello?serviceClass=com.cd.web.service.HelloCxfService&dataFormat=POJO")		
		
		.convertBodyTo(HelloInputDTO.class)
		
		.marshal(jaxb)
		
		.to("log:HelloServiceLogger");
		
		
		// routing end
	}

}
