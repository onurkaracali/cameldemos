package com.cd.web.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.cd.web.dto.HelloInputDTO;
import com.cd.web.dto.HelloOutputDTO;

@WebService
public interface HelloCxfService {

	@WebMethod HelloOutputDTO getHello(@WebParam(name="req") HelloInputDTO request);
}
