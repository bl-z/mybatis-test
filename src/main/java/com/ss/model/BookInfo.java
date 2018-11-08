package com.ss.model;

import java.util.List;

public class BookInfo {
	
	private long bookInfoId;
	private long bookId;
	private String detail;
	private String packageStyle;
	private Publish publish;
	private List<PrintInfo> printInfo;
	private List<String> imges;
	
	public long getBookInfoId() {
		return bookInfoId;
	}
	public void setBookInfoId(long bookInfoId) {
		this.bookInfoId = bookInfoId;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPackageStyle() {
		return packageStyle;
	}
	public void setPackageStyle(String packageStyle) {
		this.packageStyle = packageStyle;
	}
	public Publish getPublish() {
		return publish;
	}
	public void setPublish(Publish publish) {
		this.publish = publish;
	}
	
	public List<PrintInfo> getPrintInfo() {
		return printInfo;
	}
	public void setPrintInfo(List<PrintInfo> printInfo) {
		this.printInfo = printInfo;
	}
	public List<String> getImges() {
		return imges;
	}
	public void setImges(List<String> imges) {
		this.imges = imges;
	}
	@Override
	public String toString() {
		return "BookInfo [bookInfoId=" + bookInfoId + ", bookId=" + bookId + ", detail=" + detail + ", packageStyle="
				+ packageStyle + ", publish=" + publish + ", printInfo=" + printInfo + ", imges=" + imges + "]";
	}
	public BookInfo(long bookInfoId, long bookId, String detail, String packageStyle, Publish publish,
			List<PrintInfo> printInfo, List<String> imges) {
		this.bookInfoId = bookInfoId;
		this.bookId = bookId;
		this.detail = detail;
		this.packageStyle = packageStyle;
		this.publish = publish;
		this.printInfo = printInfo;
		this.imges = imges;
	}
	public BookInfo() {

	}
	
	
	
	
	
	
	
	

}
