import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Test extends ModuleBase {

	public Test(MessageReceivedEvent event) {
		super(event);
		// TODO Auto-generated constructor stub 
	}

	@Override
	public void process() {
		channel.sendMessage("Hello! You are gay " + user.getName()).queue();
		channel.sendMessage("You entered,\t" + comnand).queue();

	}

}
