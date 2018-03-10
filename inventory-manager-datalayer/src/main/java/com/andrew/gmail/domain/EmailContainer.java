package com.andrew.gmail.domain;

import java.nio.charset.Charset;

public class EmailContainer {

	public String emailBody;
	public String mimeType;
	public Charset charset;
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	public String getEmailBody() {
		return emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public Charset getCharset() {
		return charset;
	}

	public void setCharset(Charset charset) {
		this.charset = charset;
	}
}
