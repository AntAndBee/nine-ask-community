package com.world.wen.model;

/**
 * AwsAnswerVote entity. @author MyEclipse Persistence Tools
 */

public class AwsAnswerVote implements java.io.Serializable {

	// Fields

	private Integer voterId;
	private Integer answerId;
	private Integer answerUid;
	private Integer voteUid;
	private Integer addTime;
	private Short voteValue;
	private Integer reputationFactor;

	// Constructors

	/** default constructor */
	public AwsAnswerVote() {
	}

	/** minimal constructor */
	public AwsAnswerVote(Short voteValue) {
		this.voteValue = voteValue;
	}

	/** full constructor */
	public AwsAnswerVote(Integer answerId, Integer answerUid, Integer voteUid,
			Integer addTime, Short voteValue, Integer reputationFactor) {
		this.answerId = answerId;
		this.answerUid = answerUid;
		this.voteUid = voteUid;
		this.addTime = addTime;
		this.voteValue = voteValue;
		this.reputationFactor = reputationFactor;
	}

	// Property accessors

	public Integer getVoterId() {
		return this.voterId;
	}

	public void setVoterId(Integer voterId) {
		this.voterId = voterId;
	}

	public Integer getAnswerId() {
		return this.answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public Integer getAnswerUid() {
		return this.answerUid;
	}

	public void setAnswerUid(Integer answerUid) {
		this.answerUid = answerUid;
	}

	public Integer getVoteUid() {
		return this.voteUid;
	}

	public void setVoteUid(Integer voteUid) {
		this.voteUid = voteUid;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	public Short getVoteValue() {
		return this.voteValue;
	}

	public void setVoteValue(Short voteValue) {
		this.voteValue = voteValue;
	}

	public Integer getReputationFactor() {
		return this.reputationFactor;
	}

	public void setReputationFactor(Integer reputationFactor) {
		this.reputationFactor = reputationFactor;
	}

}