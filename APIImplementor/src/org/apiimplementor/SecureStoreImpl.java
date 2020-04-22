package org.apiimplementor;

import java.util.List;
import java.util.Map;

import com.trustedcompany.SecureStoreAccess;


public class SecureStoreImpl implements SecureStoreAccess {
	
	int accountId;
	String username;
	String password;
	List<String> serverList;
	Map<String, String> configParams;
	

	public SecureStoreImpl(int accountId, String username, String password, List<String> serverList,
			Map<String, String> configParams) {
		this.accountId = accountId;
		this.username = username;
		this.password = password;
		this.serverList = serverList;
		this.configParams = configParams;
	}

	public void configureServers(int accountId, String username, String password, List<String> serverList,
			Map<String, String> configParams) {
		System.out.println("Server configs are set..");

	}

	public void connect() {
		configureServers(accountId, username, password, serverList,configParams);
		System.out.println("Connected to servers..");
	}

	public void accessData() {
		System.out.println("Data accessed..");
	}

	public void putData() {
		System.out.println("Data Inserted..");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected..");
		
	}

}
