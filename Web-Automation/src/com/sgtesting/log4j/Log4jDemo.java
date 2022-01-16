package com.sgtesting.log4j;

import org.apache.log4j.Logger;

public class Log4jDemo {

	public static Logger log = Logger.getLogger("forloop result: ");

	public static void main(String[] args) {

		log.info("forloop starts here........");// comments- logging the stmt into log file for every action
		for (int i = 20; i <= 40; i++) {
			if (i % 2 == 0)
				log.info("Even no :" + i);
		}
		log.info("forloop starts here........");

	}

}