package application;

import inmemrybank.InMemoryDB;

public class ManageRegistry {

	private static ManageRegistry instance = null;
	
	private ManageRegistry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static ManageRegistry getInstance() {

		if (ManageRegistry.instance == null)
			ManageRegistry.instance = new ManageRegistry();

		return ManageRegistry.instance;
	}
}
