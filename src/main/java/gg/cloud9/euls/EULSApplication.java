package gg.cloud9.euls;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EULSApplication extends Application<EULSConfiguration> {
	final Logger logger = LoggerFactory.getLogger(EULSApplication.class);

	public static void main(String[] args) throws Exception {
		new EULSApplication().run(args);
	}

	@Override
	public String getName() {
		return "EULS";
	}

	@Override
	public void initialize(Bootstrap<EULSConfiguration> bootstrap) {
	}

	@Override
	public void run(EULSConfiguration configuration, Environment environment) throws Exception {
		logger.info("Running server");
		final EULSResource resource = new EULSResource();
		environment.jersey().register(resource);

	}
}
