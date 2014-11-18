package net.xdwander.business.hibernate3.dao;

import java.util.List;

import net.xdwander.business.domain.ItemInterface;

public interface ItemDAOInterface {
	
	List<ItemInterface> getItems();
}