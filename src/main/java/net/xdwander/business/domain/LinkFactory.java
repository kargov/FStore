package net.xdwander.business.domain;

import net.xdwander.fstore.pages.ExceptionPage;

import org.apache.wicket.Page;
import org.apache.wicket.WicketRuntimeException;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.link.AbstractLink;

public abstract class LinkFactory {


	public static AjaxLink get(String wicketId, final UnityCommandInterface command) {

		if (wicketId == null) {
			throw new IllegalArgumentException("You need to provide a valid wicket id");
		}

		if (command == null) {
			throw new IllegalArgumentException("You need to provide a valid command");
		}
		
		AjaxLink link = new AjaxLink(wicketId) {
			
			private static final long serialVersionUID = 1L;

			@Override
			public void onClick(AjaxRequestTarget target) {
				Page page = getPage();
				command.setRootPage((RootPageInterface) page);
				try {
					command.execute();
				}
				catch (WicketRuntimeException e) {
					getRequestCycle().setResponsePage(new ExceptionPage());
				}
			}
		};
		
		return link;
	}
}
