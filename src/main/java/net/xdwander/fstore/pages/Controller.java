package net.xdwander.fstore.pages;

import net.xdwander.business.domain.AbstractCommand;

public class Controller {

	public static class SendMailCommand extends AbstractCommand {
		
		private static final long serialVersionUID = 1L;
		private ContactUsModel model;
		private ContactUsPage page;
		
		public SendMailCommand(ContactUsPage page,ContactUsModel model) {
			this.model = model;
			this.page = page;
		}
		
		public void execute() {
			model.send();
			page.refresh();
			
		}
	}
	
	public static class ShowHomePageCommand extends AbstractCommand {
		
		private static final long serialVersionUID = 1L;

		public void execute() {
			HomePage page = new HomePage();
			redirect(page);
		}
	}

	public static class ShowAboutUsPageCommand extends AbstractCommand {
		
		private static final long serialVersionUID = 1L;
		
		public void execute() {
			AboutUsPage page = new AboutUsPage();
			redirect(page);
		}
	}
	
	public static class ShowChairsPageCommand extends AbstractCommand{
		
		private static final long serialVersionUID = 1L;
		
		public void execute() {
			ChairsPage page = new ChairsPage();
			redirect(page);
		}
	}
	
	public static class ShowTablesPageCommand extends AbstractCommand {
		
		private static final long serialVersionUID = 1L;
		
		public void execute() {
			TablesPage page = new TablesPage();
			redirect(page);
		}
	}
	
	public static class ShowContactUsPageCommand extends AbstractCommand {
		
		private static final long serialVersionUID = 1L;
		
		public void execute() {
			ContactUsPage page = new ContactUsPage(ContactUsModel.createForNew());
			redirect(page);
		}
	}


}
