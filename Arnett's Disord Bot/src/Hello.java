import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Hello extends ModuleBase {

	public Hello(MessageReceivedEvent event) {
		super(event);
		// TODO Auto-generated constructor stub
	}
		
	@Override
	public void process() {
		channel.sendMessage("**Hello** **" + this.user.getName() +",**\nhow is your day?").queue();

	}

}
	