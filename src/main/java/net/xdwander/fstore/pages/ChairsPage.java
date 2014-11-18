package net.xdwander.fstore.pages;

import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.basic.Label;


public class ChairsPage extends BasePage {

	private static final long serialVersionUID = 1L;

	public ChairsPage() {
		add(new Label("product_name_header",Messages.getString("product_description_header")));
		add(new Label("product_content_ch",Messages.getString("chairs_page_product_content")));
		add(new Label("product_description_header",Messages.getString("product_description_header")));
		add(new Label("product_description_content",Messages.getString("chairs_page_product_description_content")));
		
		add(new Label("product_details_header",Messages.getString("product_details_header")));
		add(new Label("height",Messages.getString("chairs_page_product_details_height")));
		add(new Label("width",Messages.getString("chairs_page_product_details_width")));
		add(new Label("seat_depth",Messages.getString("chairs_page_product_details_seat_depth")));
		add(new Label("seat_height",Messages.getString("chairs_page_product_details_seath_height")));
		
		
		add(new Label("color_picker_label",Messages.getString("chairs_page_color_picker_label")));
		add(new Label("color_red",Messages.getString("chairs_page_color_red")));
		add(new Label("color_blue",Messages.getString("chairs_page_color_blue")));
		add(new Label("color_black",Messages.getString("chairs_page_color_black")));
		add(new Label("color_darck_grey",Messages.getString("chairs_page_color_dark_grey")));
		add(new Label("color_light_grey",Messages.getString("chairs_page_color_light_grey")));
	}

    @Override 
    public void renderHead(IHeaderResponse response) {
    	response.renderOnLoadJavaScript("menu('chairs')");
        response.renderOnLoadJavaScript("menu_selector('chairs');"); 
    } 

}
