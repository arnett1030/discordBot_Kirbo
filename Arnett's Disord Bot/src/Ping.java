import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Ping extends ModuleBase {

	public Ping(MessageReceivedEvent event) {
		super(event);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process() {
		channel.sendMessage("Pong!").queue();

	}

}
