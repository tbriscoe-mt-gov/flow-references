package com.lowcoders.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;


public class ExitJVM implements Callable {

	Logger log = LoggerFactory.getLogger(ExitJVM.class);

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		log.info("Exiting Application");
		System.exit(0);
		return null;
	}}
