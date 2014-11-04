package test.main;

import org.orman.dbms.Database;
import org.orman.dbms.mysql.MySQL;
import org.orman.dbms.mysql.MySQLSettingsImpl;
import org.orman.mapper.MappingSession;

public class TestMySQL {

	public static void main(String[] args) {
		Database db = new MySQL(new MySQLSettingsImpl("root", "123456", "test"));
		MappingSession.registerDatabase(db);
		MappingSession.start();
	}

}
