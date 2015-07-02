package com.world.wen.model;

/**
 * AwsAttach entity. @author MyEclipse Persistence Tools
 */

public class AwsAttach implements java.io.Serializable {

	// Fields

	private Integer id;
	private String fileName;
	private String accessKey;
	private Integer addTime;
	private String fileLocation;
	private Integer isImage;
	private String itemType;
	private Long itemId;
	private Boolean waitApproval;

	// Constructors

	/** default constructor */
	public AwsAttach() {
	}

	/** minimal constructor */
	public AwsAttach(Boolean waitApproval) {
		this.waitApproval = waitApproval;
	}

	/** full constructor */
	public AwsAttach(String fileName, String accessKey, Integer addTime,
			String fileLocation, Integer isImage, String itemType, Long itemId,
			Boolean waitApproval) {
		this.fileName = fileName;
		this.accessKey = accessKey;
		this.addTime = addTime;
		this.fileLocation = fileLocation;
		this.isImage = isImage;
		this.itemType = itemType;
		this.itemId = itemId;
		this.waitApproval = waitApproval;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	public String getFileLocation() {
		return this.fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public Integer getIsImage() {
		return this.isImage;
	}

	public void setIsImage(Integer isImage) {
		this.isImage = isImage;
	}

	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Boolean getWaitApproval() {
		return this.waitApproval;
	}

	public void setWaitApproval(Boolean waitApproval) {
		this.waitApproval = waitApproval;
	}

}