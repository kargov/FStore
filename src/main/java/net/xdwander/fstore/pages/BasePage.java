package net.xdwander.fstore.pages;


import net.xdwander.business.domain.ContentInterface;
import net.xdwander.business.domain.LinkFactory;
import net.xdwander.business.domain.RootPageInterface;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebComponent;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.cycle.RequestCycle;

public class BasePage extends WebPage implements ContentInterface, RootPageInterface {

	private static final long serialVersionUID = 1L;
	private transient BasePage newPage;
	
	private static class ContentPlaceholder extends WebComponent implements ContentInterface {
		private static final long serialVersionUID = 1L;

		public ContentPlaceholder() {
			super(CONTENT_ID);
		}

		/*
		 * This is an empty placeholder, not visible on the screen.
		 */
		@Override
		public boolean isVisible() {
			return false;
		}
	}
	
	
	public BasePage() {
		add(LinkFactory.get("logoHomePage", new Controller.ShowHomePageCommand()));
		add(LinkFactory.get("homePage", new Controller.ShowHomePageCommand()));
		add(LinkFactory.get("aboutUsPage", new Controller.ShowAboutUsPageCommand()));
		add(LinkFactory.get("tablesPage", new Controller.ShowTablesPageCommand()));
		add(LinkFactory.get("chairsPage", new Controller.ShowChairsPageCommand()));
		add(LinkFactory.get("contactUsPage", new Controller.ShowContactUsPageCommand()));
		add(LinkFactory.get("footerContanctUsPage", new Controller.ShowContactUsPageCommand()));
		add(new ContentPlaceholder());
	}
	
	public void setContent(ContentInterface content) {
		Component contentComponent = (Component) content;
		contentComponent.setOutputMarkupPlaceholderTag(true);
		getNewPage().replace(contentComponent);
	}
	
	public BasePage getNewPage() {
		if (newPage == null) {
			newPage = new BasePage();
			RequestCycle.get().setResponsePage(newPage);
		}

		return newPage;
	}

}
