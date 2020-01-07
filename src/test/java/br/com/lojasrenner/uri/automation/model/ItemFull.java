package br.com.lojasrenner.uri.automation.model;

public class ItemFull {

	private String sku;
	private String size;
	private boolean rfid;
	private Long parentitemcode;

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public boolean isRfid() {
		return rfid;
	}

	public void setRfid(boolean rfid) {
		this.rfid = rfid;
	}

	public Long getParentitemcode() {
		return parentitemcode;
	}

	public void setParentitemcode(Long parentitemcode) {
		this.parentitemcode = parentitemcode;
	}

}
