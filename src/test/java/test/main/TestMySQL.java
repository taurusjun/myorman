package test.main;

import org.orman.dbms.Database;
import org.orman.dbms.mysql.MySQL;
import org.orman.dbms.mysql.MySQLSettingsImpl;
import org.orman.mapper.MappingSession;
import org.orman.util.logging.Log;
import org.orman.util.logging.LoggingLevel;
import org.orman.util.logging.StandardLogger;

public class TestMySQL {

	public static void main(String[] args) {
		Log.setLogger(new StandardLogger());
		Log.setLevel(LoggingLevel.TRACE);
		Database db = new MySQL(new MySQLSettingsImpl("root", "123456", "test"));
		MappingSession.registerDatabase(db);
		MappingSession.start();
	}

}
