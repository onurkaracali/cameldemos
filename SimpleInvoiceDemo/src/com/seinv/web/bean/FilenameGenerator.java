package com.seinv.web.bean;

import java.util.Date;

import com.seinv.web.dto.InvoiceSenderEnvelope;

public class FilenameGenerator {
	public String generateFileName(InvoiceSenderEnvelope invoiceSenderEnvelope) {
		String senderName = invoiceSenderEnvelope.getSenderName();
		String targetName = invoiceSenderEnvelope.getTargetName();
		
		String senderId = invoiceSenderEnvelope.getSenderIdentifier();
		String targetId = invoiceSenderEnvelope.getTargetId();
		
		String date = new Date().toString().replace(":", "-");
		
		return (date + "-" + senderName + "-" + targetName).replace(" ", "-");
	}
}
