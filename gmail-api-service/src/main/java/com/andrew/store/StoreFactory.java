package com.andrew.store;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StoreFactory {
	
	private static final Logger LOGGER = LogManager.getLogger(StoreFactory.class);
	private final static String WALMART = "walmart";
	private final static String TARGET = "target";
	private final static String HOME_DEPOT = "homedepot";
	private final static String NIKE = "nike";
	private final static String BARNES_NOBLE = "barnesnoble";
	private final static String TRU = "toysrus";
	private final static String KMART = "kmart";
	private final static String LEGO = "lego";
	private final static String JOURNEYS = "journeys";
	private final static String BGG	= "boardgamegeek";
	
	
	public static AbstractProcessor getStore(String name) {
		if (WALMART.equals(name)) {
			return new WalmartProcessor();
		} else if (TARGET.equals(name)) {
			return new TargetProcessor();
		} else if (HOME_DEPOT.equals(name)) {
			return new HomeDepotProcessor();
		} else if (NIKE.equals(name)) {
			return new NikeProcessor();
		} else if (BARNES_NOBLE.equals(name)) {
			return new BarnesNobleProcessor();
		} else if (TRU.equals(name)) {
			return new TRUProcessor();
		} else if (KMART.equals(name)) {
			return new KmartProcessor();
		} else if (LEGO.equals(name)) {
			return new LegoProcessor();
		} else if (JOURNEYS.equals(name)) {
			return new JourneysProcessor();
		} else if (BGG.equals(name)) {
			return new BGGProcessor();
		} else {
			LOGGER.error("Factory Class did not match" + name);
		}
		return null;
	}
}
