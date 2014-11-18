package net.xdwander.business.services;

import java.util.List;

import net.xdwander.business.domain.ItemInterface;
import net.xdwander.business.domain.exceptions.DomainException;
import net.xdwander.business.hibernate3.dao.ItemDAOInterface;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = DomainException.class)
public class ItemService implements ItemServiceInterface {

	private ItemDAOInterface itemDAO;

	public List<ItemInterface> getItems() {
		return itemDAO.getItems();
	}
	
	public ItemDAOInterface getItemDAO() {
		return itemDAO;
	}

	public void setItemDAO(ItemDAOInterface itemDAO) {
		this.itemDAO = itemDAO;
	}
}
