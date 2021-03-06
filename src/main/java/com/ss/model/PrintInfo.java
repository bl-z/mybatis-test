package com.ss.model;

public class PrintInfo {

	private Long printId;
	private Long bookInfoId;
	private Printer printer;
	private String printSize;
	private String printDate;
	private String printNum;
	private Short printBatch;

	public Long getPrintId() {
		return printId;
	}

	public void setPrintId(Long printId) {
		this.printId = printId;
	}

	public Long getBookInfoId() {
		return bookInfoId;
	}

	public void setBookInfoId(Long bookInfoId) {
		this.bookInfoId = bookInfoId;
	}

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public String getPrintSize() {
		return printSize;
	}

	public void setPrintSize(String printSize) {
		this.printSize = printSize;
	}

	public String getPrintDate() {
		return printDate;
	}

	public void setPrintDate(String printDate) {
		this.printDate = printDate;
	}

	public String getPrintNum() {
		return printNum;
	}

	public void setPrintNum(String printNum) {
		this.printNum = printNum;
	}

	public Short getPrintBatch() {
		return printBatch;
	}

	public void setPrintBatch(Short printBatch) {
		this.printBatch = printBatch;
	}

	@Override
	public String toString() {
		return "PrintInfo [printId=" + printId + ", bookInfoId=" + bookInfoId + ", printer=" + printer + ", printSize="
				+ printSize + ", printDate=" + printDate + ", printNum=" + printNum + ", printBatch=" + printBatch
				+ "]";
	}

	public PrintInfo(Long printId, Long bookInfoId, Printer printer, String printSize, String printDate,
			String printNum, Short printBatch) {
		this.printId = printId;
		this.bookInfoId = bookInfoId;
		this.printer = printer;
		this.printSize = printSize;
		this.printDate = printDate;
		this.printNum = printNum;
		this.printBatch = printBatch;
	}

	public PrintInfo() {

	}

}
