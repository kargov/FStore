package net.xdwander.business.domain;


public interface ItemInterface {

	public abstract Long getId();

	public abstract String getName();

	public abstract float getPrice();

	public abstract byte[] getPicture();

}