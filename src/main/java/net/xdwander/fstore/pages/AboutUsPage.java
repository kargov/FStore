package net.xdwander.fstore.pages;

import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.basic.Label;

public class AboutUsPage extends BasePage {
	private static final long serialVersionUID = 1L;

    public AboutUsPage() {
    	add(new Label("about_us_company_mission_label", Messages.getString("about_us_company_mission_label")));
    	add(new Label("about_us_company_mission",Messages.getString("about_us_company_mission")));
    	add(new Label("about_us_company_vision_label", Messages.getString("about_us_company_vision_label")));
    	add(new Label("about_us_company_vision",Messages.getString("about_us_company_vision")));
    	add(new Label("about_us_company_values_label",Messages.getString("about_us_company_values_label")));
    	add(new Label("about_us_company_values",Messages.getString("about_us_company_values")));
    }
    
    
    @Override 
    public void renderHead(IHeaderResponse response) {
    	response.renderOnDomReadyJavaScript("menu('about_us');"); 
        response.renderOnDomReadyJavaScript("menu_selector('about_us');"); 
    } 

}