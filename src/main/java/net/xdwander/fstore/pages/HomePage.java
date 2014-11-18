package net.xdwander.fstore.pages;

import net.xdwander.business.domain.LinkFactory;
import net.xdwander.fstore.components.CameraView;

import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends BasePage {
	private static final long serialVersionUID = 1L;

    public HomePage() {
    	add(new CameraView("camera"));
    	AjaxLink chairsLink = LinkFactory.get("homeChairsPage", new Controller.ShowChairsPageCommand());
    	chairsLink.add(new Label("home_page_chairs",Messages.getString("home_page_chairs")));
    	add(chairsLink);
    	
    	AjaxLink tablesLink = LinkFactory.get("homeTablesPage", new Controller.ShowTablesPageCommand());
    	tablesLink.add(new Label("home_page_tables",Messages.getString("home_page_tables")));
    	add(tablesLink);
    }
    
    @Override 
    public void renderHead(IHeaderResponse response) {
    	response.renderOnDomReadyJavaScript("menu('home');"); 
        response.renderOnDomReadyJavaScript("menu_selector('home');"); 
        response.renderOnDomReadyJavaScript("table();");   
    } 

}