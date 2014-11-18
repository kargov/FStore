package net.xdwander.business.domain;


public class Item implements ItemInterface {
	private Long id;
	private Integer version;
	private String name;
	private float price;
	private byte[] picture;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}

	public byte[] getPicture() {
		return picture;
	}
	
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
