package com.andrew.gmail.domain;

import java.util.List;

public class GmailEmailInfo {

	private String subject;
	private String messageId;
	private String threadId;
	private String messageBody;
	private String destinationEmailAddr;
	private String sourceEmailAddr;
	private String snippit;
	private List<String> labelids;
	private Receipt receipt;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getThreadId() {
		return threadId;
	}
	public void setThreadId(String threadId) {
		this.threadId = threadId;
	}
	public String getMessageBody() {
		return messageBody;
	}
	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}
	public String getDestinationEmailAddr() {
		return destinationEmailAddr;
	}
	public void setDestinationEmailAddr(String destinationEmailAddr) {
		this.destinationEmailAddr = destinationEmailAddr;
	}
	public String getSourceEmailAddr() {
		return sourceEmailAddr;
	}
	public void setSourceEmailAddr(String sourceEmailAddr) {
		this.sourceEmailAddr = sourceEmailAddr;
	}
	public String getSnippit() {
		return snippit;
	}
	public void setSnippit(String snippit) {
		this.snippit = snippit;
	}
	public List<String> getLabelids() {
		return labelids;
	}
	public void setLabelids(List<String> labelids) {
		this.labelids = labelids;
	}
	public Receipt getReceipt() {
		return receipt;
	}
	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}
	
	
}
