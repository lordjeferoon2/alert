package com.hacom.comapi.entities;

public class EventCode {
	private String valueName;
    private String value;
    
	public EventCode(String valueName, String value) {
		super();
		this.valueName = valueName;
		this.value = value;
	}

	public String getValueName() {
		return valueName;
	}

	public void setValueName(String valueName) {
		this.valueName = valueName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
    
}
