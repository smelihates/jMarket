package jMarket.eMail;

public class EMailManager {
	private int id;
	private String subject;
	private String body;
	
	public EMailManager() {
		
	}

	public EMailManager(int id, String subject, String body) {
		this.id = id;
		this.subject = subject;
		this.body = body;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
	
}
