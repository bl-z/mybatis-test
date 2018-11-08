package com.ss.model;

public class Printer {

	private Long printerId;
	private String printerName;
	private String printerAddress;
	private String printerPhone;
	private String printerzip;
	private String printerLegalPerson;
	private String contactPerson;
	private String contactCellPhone;
	private String faxNum;

	public Long getPrinterId() {
		return printerId;
	}

	public void setPrinterId(Long printerId) {
		this.printerId = printerId;
	}

	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	public String getPrinterAddress() {
		return printerAddress;
	}

	public void setPrinterAddress(String printerAddress) {
		this.printerAddress = printerAddress;
	}

	public String getPrinterPhone() {
		return printerPhone;
	}

	public void setPrinterPhone(String printerPhone) {
		this.printerPhone = printerPhone;
	}

	public String getPrinterzip() {
		return printerzip;
	}

	public void setPrinterzip(String printerzip) {
		this.printerzip = printerzip;
	}

	public String getPrinterLegalPerson() {
		return printerLegalPerson;
	}

	public void setPrinterLegalPerson(String printerLegalPerson) {
		this.printerLegalPerson = printerLegalPerson;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactCellPhone() {
		return contactCellPhone;
	}

	public void setContactCellPhone(String contactCellPhone) {
		this.contactCellPhone = contactCellPhone;
	}

	public String getFaxNum() {
		return faxNum;
	}

	public void setFaxNum(String faxNum) {
		this.faxNum = faxNum;
	}

	@Override
	public String toString() {
		return "Printer [printerId=" + printerId + ", printerName=" + printerName + ", printerAddress=" + printerAddress
				+ ", printerPhone=" + printerPhone + ", printerzip=" + printerzip + ", printerLegalPerson="
				+ printerLegalPerson + ", contactPerson=" + contactPerson + ", contactCellPhone=" + contactCellPhone
				+ ", faxNum=" + faxNum + "]";
	}

	public Printer(Long printerId, String printerName, String printerAddress, String printerPhone, String printerzip,
			String printerLegalPerson, String contactPerson, String contactCellPhone, String faxNum) {
		this.printerId = printerId;
		this.printerName = printerName;
		this.printerAddress = printerAddress;
		this.printerPhone = printerPhone;
		this.printerzip = printerzip;
		this.printerLegalPerson = printerLegalPerson;
		this.contactPerson = contactPerson;
		this.contactCellPhone = contactCellPhone;
		this.faxNum = faxNum;
	}

	public Printer() {

	}

}
