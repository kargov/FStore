package net.xdwander.fstore;

import net.xdwander.business.services.ItemServiceInterface;
import net.xdwander.fstore.pages.ExceptionPage;
import net.xdwander.fstore.pages.HomePage;

import org.apache.wicket.protocol.http.WebApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 * @see net.xdwander.Start#main(String[])
 */
public class WicketApplication extends WebApplication {    	

	private ItemServiceInterface itemService;

	@Override
	public Class<HomePage> getHomePage() {
		return HomePage.class;
	}

	@Override
	public void init()
	{
		super.init();
		initializeServices();
		getMarkupSettings().setStripWicketTags(true);
		getApplicationSettings().setInternalErrorPage(ExceptionPage.class);
	}
	
	private void initializeServices() {
		//ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		//setItemService((ItemServiceInterface) ctx.getBean("itemService"));
	}
	
	public ItemServiceInterface getItemService() {
		return itemService;
	}

	public void setItemService(ItemServiceInterface itemService) {
		this.itemService = itemService;
	}
}
