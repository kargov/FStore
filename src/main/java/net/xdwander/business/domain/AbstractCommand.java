package net.xdwander.business.domain;

import java.io.Serializable;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.cycle.RequestCycle;

public abstract class AbstractCommand implements UnityCommandInterface, Serializable {

	private static final long serialVersionUID = 1L;
	private RootPageInterface mainPage;
	
	public void redirect(WebPage page) {
		RequestCycle.get().setResponsePage(page);
	}

	public RootPageInterface getRootPage() {
		return mainPage;
	}

	public void setRootPage(RootPageInterface mainPage) {
		this.mainPage = mainPage;
	}
}
