package com.trustedcompany;


import java.util.List;
import java.util.Map;

public interface SecureStoreAccess {
 public void configureServers(int accountId, String username, String password,List<String> serverList,Map<String,String> configParams);
 public void connect();
 public void accessData();
 public void putData();
 public void disconnect();
}
