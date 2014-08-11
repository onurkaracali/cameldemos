package com.seinv.web.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.seinv.web.dto.InvoiceSenderEnvelope;
import com.seinv.web.exception.ValidationException;

public class ATypeDocValidationProcessor implements Processor{

	@Override
	public void process(Exchange arg0) throws Exception {
		
		InvoiceSenderEnvelope invoiceSenderEnvelope = (InvoiceSenderEnvelope)arg0.getIn().getBody();
		
		if((invoiceSenderEnvelope.getSenderType()==0 
				&& invoiceSenderEnvelope.getSenderIdentifier().length() != 11)				
			|| (invoiceSenderEnvelope.getSenderType()==1
				&& invoiceSenderEnvelope.getSenderIdentifier().length()!=8)) {
			throw new ValidationException("Gönderici Identifier formatý geçersiz");
		} 
		
		if((invoiceSenderEnvelope.getTargetType()==0 
				&& invoiceSenderEnvelope.getTargetId().length() != 11)				
			|| (invoiceSenderEnvelope.getTargetType()==1
				&& invoiceSenderEnvelope.getTargetId().length()!=8)) {
			throw new ValidationException("Alýcý Identifier formatý geçersiz");
		} 
	}

}
