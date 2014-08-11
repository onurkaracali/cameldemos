package com.cd.web.routing;

import com.cd.web.dto.HelloInputDTO;
import com.cd.web.dto.HelloOutputDTO;

public class ResultGenerator {
	public HelloOutputDTO getResponse(HelloInputDTO helloInputDTO){
		HelloOutputDTO helloOutputDTO = new HelloOutputDTO();
		
		helloOutputDTO.setMessage(helloInputDTO.getHelloMsg());
		helloOutputDTO.setOwner(helloInputDTO.getOwner());
		
		return helloOutputDTO;
	}
}
