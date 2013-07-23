package models;

import java.util.Map;

public class BatchMail extends Mail {
	/**
	 * Map<String, String> sendToMap = new ArrayMap<String,String>();
	 * sendToMap.add("test.user@example.com", "Test User");
	 * sendToMap.add("user.test@example.com", "User Test");
	 */
	public Map<String, String> sendToMap;
	/**
	 * Name, Mail 
	 * test.user@example.com, Test User 
	 * user.test@example.com, User Test
	 * 
	 */
	public String sendToUrl;
}
