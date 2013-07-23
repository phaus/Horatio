package models;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;

import play.db.ebean.Model;

@Entity
public class Mail extends Model {
	public String subject;
	public String sendFrom;
	public String replyTo;
	public List<String> sendCc;
	public List<String> sendBcc;
	public List<String> attachmentUrls;
	public String textUrl;
	public String templateUrl;
	public Map<String, String> properties;
}
