import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Help extends ModuleBase {

	public Help(MessageReceivedEvent event) {
		super(event);
	}

	@Override
	public void process() {
		channel.sendMessage("List of Available Commands:\n!ping\n!help").queue(); 
		

	}

}
