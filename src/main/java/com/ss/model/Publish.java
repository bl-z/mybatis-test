package com.ss.model;

public class Publish {

	private long publishId;
	private String publishName;
	private String publishDate;
	private long publishNum;

	public long getPublishId() {
		return publishId;
	}

	public void setPublishId(long publishId) {
		this.publishId = publishId;
	}

	public String getPublishName() {
		return publishName;
	}

	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public long getPublishNum() {
		return publishNum;
	}

	public void setPublishNum(long publishNum) {
		this.publishNum = publishNum;
	}

	@Override
	public String toString() {
		return "Publish [publishId=" + publishId + ", publishName=" + publishName + ", publishDate=" + publishDate
				+ ", publishNum=" + publishNum + "]";
	}

	public Publish(long publishId, String publishName, String publishDate, long publishNum) {
		this.publishId = publishId;
		this.publishName = publishName;
		this.publishDate = publishDate;
		this.publishNum = publishNum;
	}

	public Publish() {

	}

}
