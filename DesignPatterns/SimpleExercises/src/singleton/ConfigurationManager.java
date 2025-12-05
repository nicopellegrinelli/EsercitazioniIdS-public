package singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ConfigurationManager {
	private Map<String, String> configurations;
	private static ConfigurationManager instance;
	
	private ConfigurationManager() {
		configurations = new HashMap<String, String>();
	}
	
	public static ConfigurationManager getInstance() {
		if (instance == null)
			instance = new ConfigurationManager();
		return instance;
	}
	
	public void addNew(String key, String value) {
		if (configurations.containsKey(key))
			System.out.println("Chiave già presente");
		else
			configurations.put(key, value);
	}
	
	public void update(String key, String value) {
		if (!configurations.containsKey(key))
			System.out.println("Chiave non presente");
		else
			configurations.put(key, value);
	}
	
	public void print() {
		System.out.println("Configurazioni:");
		for (Entry<String, String> elem : configurations.entrySet())
			System.out.println("\t"+elem.getKey()+" -> "+elem.getValue());
	}
}
