package com.andrew.store;

import java.util.List;
import java.util.stream.Stream;

import com.andrew.gmail.domain.GmailEmailInfo;
import com.google.api.services.gmail.model.Message;

public interface IProcessor {

	public List<GmailEmailInfo> execute(Stream<Message> messages);
}
