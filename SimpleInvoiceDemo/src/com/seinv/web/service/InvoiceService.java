package com.seinv.web.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.seinv.web.dto.InvoiceSenderEnvelope;
import com.seinv.web.dto.InvoiceSystemEnvelope;

@WebService
public interface InvoiceService {
	
	@WebMethod
	public InvoiceSystemEnvelope sendDocument(
													@WebParam(name = "senderEnv")
													InvoiceSenderEnvelope senderEnvelope
											  );
	
	
}
