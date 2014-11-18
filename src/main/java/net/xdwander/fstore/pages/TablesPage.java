package net.xdwander.fstore.pages;

import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.request.resource.ContextRelativeResource;

public class TablesPage extends BasePage {

	private static final long serialVersionUID = 1L;
	private String description = Messages.getString("table_page_table_description_CFTSC");
	private String firstImageSource = "images/tablespage/table_back_02s.png";
	private String secondImageSource = "images/tablespage/table_back_03s.png"; 
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public TablesPage() {
		
		add(new Label("product_name_header",Messages.getString("product_description_header")));
		add(new Label("product_content_t",Messages.getString("table_page_product_content")));
		add(new Label("product_description_header",Messages.getString("product_description_header")));
		add(new Label("product_description_content",Messages.getString("table_page_product_description_content")));

		
		add(new Image("first_image",new ContextRelativeResource(firstImageSource)));
		add(new Image("second_image", new ContextRelativeResource(secondImageSource)));
		
		add(new Label("product_details_header",Messages.getString("product_details_header")));
		add(new Label("tableTopSizes",Messages.getString("table_page_tables_top_sizes")).setEscapeModelStrings(false));
		add(new Label("tableTopThickness",Messages.getString("table_page_tables_top_thickness")));
		add(new Label("tableHeightUnfolded",Messages.getString("table_page_tables_height_unfolded")));
		add(new Label("tableHeightfolded",Messages.getString("table_page_tables_height_folded")));
		add(new Label("stackable",Messages.getString("table_page_tables_stackable")));
		add(new Label("additional",Messages.getString("table_page_tables_additional")));
		
		
	}
	
    @Override 
    public void renderHead(IHeaderResponse response) {
    	response.renderOnDomReadyJavaScript("menu('tables');"); 
        response.renderOnDomReadyJavaScript("menu_selector('tables');"); 
    } 

}
