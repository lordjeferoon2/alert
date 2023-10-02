package com.hacom.comapi.entities;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "alerts")
public class Alert {
    @Id
    private String id;
    private String identifier;
    private String sender;
    private String status;
    private String msgType;
    private String scope;
    private Info info;
    
	public Alert(String id, String identifier, String sender, String status, String msgType, String scope, Info info) {
		super();
		this.id = id;
		this.identifier = identifier;
		this.sender = sender;
		this.status = status;
		this.msgType = msgType;
		this.scope = scope;
		this.info = info;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getSender() {
		return sender;
	}
	
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMsgType() {
		return msgType;
	}
	
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	
	public String getScope() {
		return scope;
	}
	
	public void setScope(String scope) {
		this.scope = scope;
	}
	
	public Info getInfo() {
		return info;
	}
	
	public void setInfo(Info info) {
		this.info = info;
	}
    
}