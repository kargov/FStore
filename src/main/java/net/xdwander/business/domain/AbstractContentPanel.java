package net.xdwander.business.domain;

import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;

public abstract class AbstractContentPanel extends Panel implements ContentInterface {
	private static final long serialVersionUID = 1L;

	public AbstractContentPanel() {
		super(RootPageInterface.CONTENT_ID);
	}

	public AbstractContentPanel(IModel<?> model) {
		super(RootPageInterface.CONTENT_ID, model);
	}
}
