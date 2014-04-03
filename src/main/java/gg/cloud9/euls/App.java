package gg.cloud9.euls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	Logger logger = LoggerFactory.getLogger(App.class);
	public static void main(String[] args) {
		new App().run(args);
	}

	private void run(String[] args) {
		logger.debug("Hello World!");
	}
}
