package helper;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

import models.BatchMail;
import models.Mail;
import models.SingleMail;

public class MailComposer {
	private Mail m;
	private SingleMail sm;
	private BatchMail bm;
	public MailComposer(Mail m) {
		this.m = m;
	}

	public MultiPartEmail compose() {
		MultiPartEmail email = new MultiPartEmail();
		return email;
	}


	private MultiPartEmail addTo(MultiPartEmail email) throws EmailException{
		if(m instanceof SingleMail){
			sm = (SingleMail) m;
			email.addTo(sm.sendToAddress, sm.sendToName);
		}
		return email;
	}
}
