package com.andrew.gmail.mapper;

import com.andrew.gmail.domain.GmailEmailInfo;
import com.google.api.services.gmail.model.Message;

public class MessageMapper {

	public static GmailEmailInfo mapMessageToDomain(Message mess) {
		GmailEmailInfo info = new GmailEmailInfo();
		
		return info;
	}
}