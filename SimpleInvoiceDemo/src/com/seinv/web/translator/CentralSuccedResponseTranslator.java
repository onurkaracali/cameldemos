package com.seinv.web.translator;

import com.seinv.web.dto.InvoiceSenderEnvelope;
import com.seinv.web.dto.InvoiceSystemEnvelope;

public class CentralSuccedResponseTranslator {
	
	public InvoiceSystemEnvelope translateToSucceedSystemEnvelope() {
		InvoiceSystemEnvelope invoiceSystemEnvelope = new InvoiceSystemEnvelope();
		invoiceSystemEnvelope.setResult(1);
		invoiceSystemEnvelope.setComment("Document Submitted Successfully");
		
		return invoiceSystemEnvelope;
	}
}
