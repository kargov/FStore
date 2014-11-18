package net.xdwander.business.domain;

import org.apache.wicket.markup.html.form.Form;

public class ApplicationForm<T> extends Form<T> {

	private static final long serialVersionUID = 1L;
	private UnityCommandInterface command;
	
	public ApplicationForm(String id, UnityCommandInterface command) {
		super(id);
		this.command = command;
	}
	 
	@Override
	protected void onSubmit() {
		command.execute();
	}
}
