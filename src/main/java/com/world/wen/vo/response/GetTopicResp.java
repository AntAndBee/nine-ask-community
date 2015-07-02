package com.world.wen.vo.response;

import com.world.wen.vo.ResponseBody;

/**
 * 
 * @author jswu
 *
 */
public class GetTopicResp extends ResponseBody {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6811891513108578334L;

	private Integer activeId;
	private Integer uid;
	private Integer expireTime;
	private String activeCode;
	private String activeTypeCode;
	private Integer addTime;
	private Long addIp;
	private Integer activeTime;
	private Long activeIp;
	public Integer getActiveId() {
		return activeId;
	}
	public void setActiveId(Integer activeId) {
		this.activeId = activeId;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(Integer expireTime) {
		this.expireTime = expireTime;
	}
	public String getActiveCode() {
		return activeCode;
	}
	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}
	public String getActiveTypeCode() {
		return activeTypeCode;
	}
	public void setActiveTypeCode(String activeTypeCode) {
		this.activeTypeCode = activeTypeCode;
	}
	public Integer getAddTime() {
		return addTime;
	}
	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}
	public Long getAddIp() {
		return addIp;
	}
	public void setAddIp(Long addIp) {
		this.addIp = addIp;
	}
	public Integer getActiveTime() {
		return activeTime;
	}
	public void setActiveTime(Integer activeTime) {
		this.activeTime = activeTime;
	}
	public Long getActiveIp() {
		return activeIp;
	}
	public void setActiveIp(Long activeIp) {
		this.activeIp = activeIp;
	}
}
