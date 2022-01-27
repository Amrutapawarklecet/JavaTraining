package com.marlabs.training;

import org.slf4j.*;

public class Log4jDemo {
	static Logger log = LoggerFactory.getLogger(Log4jDemo.class);

	public static void greater() {
		try {
			int a = 10, b = 20;
			if (a < b)

				log.debug("This is debug message");
			else
				log.info("This is information message");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		log.debug("This is debug message");
		// log.fatal("This is fatal message");
		log.info("This is an information message");
		log.error("This is an error message");
		log.warn("This is a warning message");
		greater();
		greater();

	}
}