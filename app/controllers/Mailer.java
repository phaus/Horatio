package controllers;

import models.BatchMail;
import models.SingleMail;

import org.codehaus.jackson.node.ObjectNode;

import play.libs.Json;
import play.mvc.Result;
import utils.MailerGenerator;

public class Mailer extends Application {
	public static Result singleMail() {
		ObjectNode result = Json.newObject();
		SingleMail mail = MailerGenerator.getSingleMail("foo@bar.de");
		result.put("mail", Json.toJson(mail));
		return ok(result);
	}

	public static Result batchMail() {
		ObjectNode result = Json.newObject();
		BatchMail mail = MailerGenerator
				.getBatchMail("http://example.com/contacts/customer.csv");
		result.put("mail", Json.toJson(mail));
		return ok(result);
	}
}
