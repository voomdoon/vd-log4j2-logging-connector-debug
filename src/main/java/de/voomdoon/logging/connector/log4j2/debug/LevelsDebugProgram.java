package de.voomdoon.logging.connector.log4j2.debug;

import de.voomdoon.logging.LogLevel;
import de.voomdoon.logging.LogManager;
import de.voomdoon.logging.Logger;
import de.voomdoon.util.cli.Program;

/**
 * @author André Schulz
 *
 * @since 0.1.0
 */
public class LevelsDebugProgram extends Program {

	/**
	 * DOCME add JavaDoc for method main
	 * 
	 * @param args
	 * @throws Exception
	 * @since 0.1.0
	 */
	public static void main(String[] args) {
		Program.run(args);
	}

	/**
	 * @since 0.1.0
	 */
	@Override
	protected void run() throws Exception {
		Logger logger = LogManager.getLogger(getClass());

		for (LogLevel level : LogLevel.values()) {
			logger.log(level, "test " + level);
		}
	}
}
