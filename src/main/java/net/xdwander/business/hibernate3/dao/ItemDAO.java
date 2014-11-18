package net.xdwander.business.hibernate3.dao;

import java.util.List;

import net.xdwander.business.domain.Item;
import net.xdwander.business.domain.ItemInterface;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.MANDATORY)
public class ItemDAO extends HibernateDaoSupport implements ItemDAOInterface {

	public List<ItemInterface> getItems() {
		DetachedCriteria c = DetachedCriteria.forClass(Item.class);
		@SuppressWarnings("unchecked")
		List<ItemInterface> items = getHibernateTemplate().findByCriteria(c);
		return items;
	}

}
