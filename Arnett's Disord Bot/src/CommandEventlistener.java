import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
	public class CommandEventlistener extends ListenerAdapter 
	{
	    @Override
	    public void onMessageReceived(MessageReceivedEvent event)
	    {
	        if (event.getAuthor().isBot()) return;
	        
	        Message message = event.getMessage();
	        String content = message.getContentRaw();
	        MessageChannel channel = event.getChannel();
	        char prefix ='!';
	        
	        if (content.equals(prefix + "ping"))
	        {
	        	new Ping(event);
	        } else if (content.startsWith(prefix + "help")) {
	        	new Help(event);
	        }else if (content.startsWith(prefix + "Hello")) {
				new Hello(event);
	        }else if (content.startsWith(prefix + "test")){
	        	new Test(event);
			}
	        else if (content.startsWith(prefix + "")) {
	        	
	        }
	        
	        
	        
	  
	   }
	  }