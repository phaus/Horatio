package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import models.BatchMail;
import models.SingleMail;

public class MailerGenerator {
	public static SingleMail getSingleMail(String to) {
		SingleMail m = new SingleMail();
		m.subject = "Single Mail Test";
		m.textUrl = "http://example.com/templates/welcome.txt.tpl";
		m.templateUrl = "http://example.com/templates/welcome.html.tpl";
		m.sendToAddress = to.trim();
		m.sendToName = to.trim();
		m.sendFrom = "horatio@consolving.de";
		m.properties = new HashMap<String, String>();
		m.properties.put("firstname", "foo");
		m.properties.put("lastname", "bar");
		m.attachmentUrls = new ArrayList<String>();
		m.attachmentUrls.add("http://example.com/docs/readme.html");
		m.attachmentUrls.add("http://example.com/images/logo.png");
		m.attachmentUrls.add("http://example.com/files/setup.zip");
		return m;
	}

	public static BatchMail getBatchMail(HashMap<String, String> sendTo) {
		BatchMail m = new BatchMail();
		m.subject = "Batch Mail Test with Receipiens List";
		m.textUrl = "http://example.com/templates/welcome.txt.tpl";
		m.templateUrl = "http://example.com/templates/welcome.html.tpl";
		m.sendToMap = sendTo;
		m.sendFrom = "horatio@consolving.de";
		m.properties = new HashMap<String, String>();
		m.properties.put("firstname", "foo");
		m.properties.put("lastname", "bar");
		m.attachmentUrls = new ArrayList<String>();
		m.attachmentUrls.add("http://example.com/docs/readme.html");
		m.attachmentUrls.add("http://example.com/images/logo.png");
		m.attachmentUrls.add("http://example.com/files/setup.zip");
		return m;
	}
	public static BatchMail getBatchMail(String sendToUrl) {
		BatchMail m = new BatchMail();
		m.subject = "Batch Mail Test with Receipiens Url";
		m.textUrl = "http://example.com/templates/welcome.txt.tpl";
		m.templateUrl = "http://example.com/templates/welcome.html.tpl";
		m.sendToUrl = sendToUrl;
		m.sendFrom = "horatio@consolving.de";
		m.properties = new HashMap<String, String>();
		m.properties.put("firstname", "foo");
		m.properties.put("lastname", "bar");
		m.attachmentUrls = new ArrayList<String>();
		m.attachmentUrls.add("http://example.com/docs/readme.html");
		m.attachmentUrls.add("http://example.com/images/logo.png");
		m.attachmentUrls.add("http://example.com/files/setup.zip");
		return m;
	}	
}
