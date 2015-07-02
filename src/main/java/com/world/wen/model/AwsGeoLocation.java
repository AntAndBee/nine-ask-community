package com.world.wen.model;

/**
 * AwsGeoLocation entity. @author MyEclipse Persistence Tools
 */

public class AwsGeoLocation implements java.io.Serializable {

	// Fields

	private Integer id;
	private String itemType;
	private Integer itemId;
	private Float latitude;
	private Float longitude;
	private Integer addTime;

	// Constructors

	/** default constructor */
	public AwsGeoLocation() {
	}

	/** minimal constructor */
	public AwsGeoLocation(String itemType, Integer itemId, Float latitude,
			Float longitude) {
		this.itemType = itemType;
		this.itemId = itemId;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	/** full constructor */
	public AwsGeoLocation(String itemType, Integer itemId, Float latitude,
			Float longitude, Integer addTime) {
		this.itemType = itemType;
		this.itemId = itemId;
		this.latitude = latitude;
		this.longitude = longitude;
		this.addTime = addTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Float getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

}