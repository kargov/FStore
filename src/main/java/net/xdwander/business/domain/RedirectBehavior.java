package net.xdwander.business.domain;

import org.apache.wicket.Component;
import org.apache.wicket.Page;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.request.cycle.RequestCycle;

public class RedirectBehavior extends Behavior {

	private static final long serialVersionUID = 1L;
	private final Class<? extends Page> page;
    private final int redirectInSeconds;

    public RedirectBehavior(Class<? extends Page> page, int redirectInSeconds) {
        this.page = page;
        this.redirectInSeconds = redirectInSeconds;
    }

    @Override
    public void renderHead(Component component, IHeaderResponse response) {
        response.renderString(String.format("<meta http-equiv='refresh' content='%d;URL=%s' />", redirectInSeconds,
                RequestCycle.get().urlFor(page, null)));
    }

}
