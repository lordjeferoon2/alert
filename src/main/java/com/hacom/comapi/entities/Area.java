package com.hacom.comapi.entities;

public class Area {
	private String areaDescription;
    private String areaPolygon;
    private String areaCircle;
    private String areaGeocode;
    private String altitude;
    private String ceiling;
	public Area(String areaDescription, String areaPolygon, String areaCircle, String areaGeocode, String altitude,
			String ceiling) {
		super();
		this.areaDescription = areaDescription;
		this.areaPolygon = areaPolygon;
		this.areaCircle = areaCircle;
		this.areaGeocode = areaGeocode;
		this.altitude = altitude;
		this.ceiling = ceiling;
	}
	
	public String getAreaDescription() {
		return areaDescription;
	}
	
	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;
	}
	
	public String getAreaPolygon() {
		return areaPolygon;
	}
	
	public void setAreaPolygon(String areaPolygon) {
		this.areaPolygon = areaPolygon;
	}
	
	public String getAreaCircle() {
		return areaCircle;
	}
	
	public void setAreaCircle(String areaCircle) {
		this.areaCircle = areaCircle;
	}
	
	public String getAreaGeocode() {
		return areaGeocode;
	}
	
	public void setAreaGeocode(String areaGeocode) {
		this.areaGeocode = areaGeocode;
	}
	
	public String getAltitude() {
		return altitude;
	}
	
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	
	public String getCeiling() {
		return ceiling;
	}
	
	public void setCeiling(String ceiling) {
		this.ceiling = ceiling;
	}
    
}
