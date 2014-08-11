package com.seinv.web.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.seinv.web.dto.InvoiceSenderEnvelope;
import com.seinv.web.exception.ValidationException;

public class BTypeDocValidationProcessor implements Processor{

	@Override
	public void process(Exchange arg0) throws Exception {
		
		InvoiceSenderEnvelope invoiceSenderEnvelope = (InvoiceSenderEnvelope)arg0.getIn().getBody();
		
		if(invoiceSenderEnvelope.getSenderIdentifier().length() < 8) {
			throw new ValidationException("BType Identifier Geçersiz");
		} 
		
		
	}

}
