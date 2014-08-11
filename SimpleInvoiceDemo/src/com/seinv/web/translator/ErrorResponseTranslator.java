package com.seinv.web.translator;

import org.apache.camel.Header;

import com.seinv.web.dto.InvoiceSystemEnvelope;

public class ErrorResponseTranslator {
	public InvoiceSystemEnvelope makeErrorResponse(@Header("errMsg") String errorMessage) {
		InvoiceSystemEnvelope invoiceSystemEnvelope = new InvoiceSystemEnvelope();
		invoiceSystemEnvelope.setResult(0);
		invoiceSystemEnvelope.setComment(errorMessage);
		
		return invoiceSystemEnvelope;
	}
}
