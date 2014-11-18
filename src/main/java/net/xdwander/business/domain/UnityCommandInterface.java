package net.xdwander.business.domain;


import java.io.Serializable;

import org.apache.wicket.markup.html.WebPage;

/**
 * Based on the Command Pattern
 */
public interface UnityCommandInterface extends Serializable {

	void execute();
	void redirect(WebPage page);
	RootPageInterface getRootPage();
	void setRootPage(RootPageInterface rootPage);
}
