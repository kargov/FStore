package net.xdwander.fstore.pages;


import net.xdwander.business.domain.ApplicationForm;
import net.xdwander.fstore.components.FeedbackLabel;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.validation.validator.EmailAddressValidator;

public class ContactUsPage extends BasePage {

	private static final long serialVersionUID = 1L;
	private Label resultLabel;
	private ApplicationForm<String> form;
	
	public ContactUsPage(ContactUsModel model) {
		form = new ApplicationForm<String>("contact_us_form", new Controller.SendMailCommand(this,model));
		form.add(new Label("your_name_label","Your Name"));
		TextField<String> name = new TextField<String>("your_name_input",new PropertyModel<String>(model,"subject"));
		FeedbackLabel nameFeedback = new FeedbackLabel("name_feedback", name,"Required!");
		name.setRequired(true);
		form.add(name);
		form.add(nameFeedback);
		
		form.add(new Label("your_email_label","Your Email"));
		TextField<String> email = new TextField<String>("your_email_input",new PropertyModel<String>(model,"sender"));
		FeedbackLabel emailFeedback = new FeedbackLabel("email_feedback", email,"Not valid email");
		email.add(EmailAddressValidator.getInstance());
		email.setRequired(true);
		form.add(email);
		form.add(emailFeedback);
		
		form.add(new Label("your_message_label","Your Message"));
		TextArea<String> message = new TextArea<String>("your_message_input",new PropertyModel<String>(model,"message"));
		FeedbackLabel messageFeedback = new FeedbackLabel("message_feedback", message,"Required!");
		message.setRequired(true);
		form.add(message);
		form.add(messageFeedback);
		
		
		Button submit = new Button("submit_button");
		form.add(submit);
		
		resultLabel = new Label("resultLabel", "Your message has been successfully sent.<br>One of reprasantatives will contact you shortly.<br>Thank you!");
		resultLabel.setEscapeModelStrings(false);
		resultLabel.setOutputMarkupId(true);
		resultLabel.setVisible(false);
		form.add(resultLabel);
		
		add(form);
	}
	
	public void refresh() {
		resultLabel.setVisible(true);
		form.setEnabled(false);
		AjaxRequestTarget target = new AjaxRequestTarget(this);
		target.add(resultLabel);
		target.add(form);
	}
    @Override 
    public void renderHead(IHeaderResponse response) {
    	response.renderOnDomReadyJavaScript("menu('contact_us');"); 
        response.renderOnDomReadyJavaScript("menu_selector('contact_us');");
        response.renderOnDomReadyJavaScript("prepareTextArea();");
    } 

}
