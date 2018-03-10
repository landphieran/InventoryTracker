package com.andrew.store;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.FormElement;
import org.jsoup.select.Elements;

import com.andrew.gmail.domain.GmailEmailInfo;
import com.google.api.services.gmail.model.Message;

public class WalmartProcessor extends AbstractProcessor {

	private static final Logger LOGGER = LogManager.getLogger(WalmartProcessor.class);
	public static final String SUBJECT = "Subject";
	public static final String FROM = "From";
	public static final String TO = "To";
	public static final String DATE = "Date";
	@Override
	public List<GmailEmailInfo> execute(Stream<Message> messages) {
		List<GmailEmailInfo> infos = new ArrayList<GmailEmailInfo>();
		
		
		List<Message> lMessages = messages.collect(Collectors.toList());
		for (Message mess : lMessages) {
			GmailEmailInfo info = parseMessageAndFillBasicInfo(mess);
			
			Document doc = Jsoup.parse(info.getMessageBody());
			
			// Order Type - Delivered
			Elements emailType = doc.getElementsByClass("moduleBreak");
			List<FormElement> forms = emailType.forms();
			String string = emailType.text();
			
			Elements tableblock = doc.getElementsByClass("makeBlock");
			List<FormElement> form = tableblock.forms();
			
		}
		return infos;
	}
}
