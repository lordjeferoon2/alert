package com.hacom.comapi.entities;

public class Resource {
	private String description;
    private String mime;
    private int size;
    private String uri;
    private String derefUri;
    private String digestResource;
	public Resource(String description, String mime, int size, String uri, String derefUri, String digestResource) {
		super();
		this.description = description;
		this.mime = mime;
		this.size = size;
		this.uri = uri;
		this.derefUri = derefUri;
		this.digestResource = digestResource;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getMime() {
		return mime;
	}
	
	public void setMime(String mime) {
		this.mime = mime;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public String getUri() {
		return uri;
	}
	
	public void setUri(String uri) {
		this.uri = uri;
	}
	
	public String getDerefUri() {
		return derefUri;
	}
	
	public void setDerefUri(String derefUri) {
		this.derefUri = derefUri;
	}
	
	public String getDigestResource() {
		return digestResource;
	}
	
	public void setDigestResource(String digestResource) {
		this.digestResource = digestResource;
	}
    
}
