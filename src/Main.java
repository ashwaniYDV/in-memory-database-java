import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DatabaseManager databaseManager = new DatabaseManager();

        Database db1 = databaseManager.createDatabase("db1");

        Table table1 = db1.createTable("students");
        table1.insertEntry("1", new HashMap<String, String>() {{
            put("name", "Ashwani");
            put("age", "21");
        }});
        table1.insertEntry("2", new HashMap<String, String>() {{
            put("name", "John");
            put("age", "20");
        }});
        System.out.println(table1.readEntry("1"));

        Table table2 = db1.createTable("subjects");
        table2.insertEntry("1", new HashMap<String, String>() {{
            put("name", "CSE");
            put("teacher", "alan");
        }});
        table2.insertEntry("2", new HashMap<String, String>() {{
            put("name", "EEE");
            put("teacher", "paul");
        }});
        System.out.println(table2.readEntry("1"));

    }
}
