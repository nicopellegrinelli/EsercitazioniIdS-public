package singleton;

public class Main {

	public static void main(String[] args) {
		ConfigurationManager cm = ConfigurationManager.getInstance();
		cm.addNew("K1", "val1");
		cm.addNew("K2", "val2");
		addK3();
		cm.update("K2", "val3");
		cm.addNew("K2", "val4");
		cm.print();
	}

	private static void addK3() {
		ConfigurationManager cm = ConfigurationManager.getInstance();
		cm.addNew("K3", "val");
	}

}
