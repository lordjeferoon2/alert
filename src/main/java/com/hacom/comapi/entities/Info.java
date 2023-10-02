package com.hacom.comapi.entities;

import java.util.Date;

public class Info {
	private String category;
    private String event;
    private String urgency;
    private String severity;
    private String certainty;
    private EventCode eventCode;
    private Date effective;
    private Date expires;
    private String senderName;
    private String headline;
    private String description;
    private String instruction;
    private Resource resource;
    private Area area;
    
	public Info(String category, String event, String urgency, String severity, String certainty, EventCode eventCode,
			Date effective, Date expires, String senderName, String headline, String description, String instruction,
			Resource resource, Area area) {
		super();
		this.category = category;
		this.event = event;
		this.urgency = urgency;
		this.severity = severity;
		this.certainty = certainty;
		this.eventCode = eventCode;
		this.effective = effective;
		this.expires = expires;
		this.senderName = senderName;
		this.headline = headline;
		this.description = description;
		this.instruction = instruction;
		this.resource = resource;
		this.area = area;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getUrgency() {
		return urgency;
	}

	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getCertainty() {
		return certainty;
	}

	public void setCertainty(String certainty) {
		this.certainty = certainty;
	}

	public EventCode getEventCode() {
		return eventCode;
	}

	public void setEventCode(EventCode eventCode) {
		this.eventCode = eventCode;
	}

	public Date getEffective() {
		return effective;
	}

	public void setEffective(Date effective) {
		this.effective = effective;
	}

	public Date getExpires() {
		return expires;
	}

	public void setExpires(Date expires) {
		this.expires = expires;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
    
}
