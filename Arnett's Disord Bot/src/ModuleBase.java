import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public abstract class ModuleBase {
	String comnand;              // The command the user entered 
	MessageReceivedEvent event; // 
	MessageChannel channel;    // Get Message channel name
	User user;                // Get user name 
	Member member;           // Get user ranking Within server 
	Guild guild;            //Discord server
	
	
	public ModuleBase (MessageReceivedEvent event) {
		this.comnand = event.getMessage().getContentRaw();
		this.event = event;
		this.channel = event.getChannel();
		this.user = event.getAuthor();
		this.member = event.getMember();
		this.guild = event.getGuild();
		process();
	}
	
	public abstract void process(); {
		
		
		
	}

}
