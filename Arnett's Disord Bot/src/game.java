import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import java.util.Random;
import java.util.Scanner;

public class game extends ModuleBase {

	public game(MessageReceivedEvent event) {
		super(event);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process() {
		
		Random rand  = new Random();
		Scanner input = new Scanner(System.in);
		
		String multiGames[] = {"League of Legends","Osu"," ","","","",""};
		String singleGames[] = {};
		boolean lcv = true; // Loop control variable 
		String ans;
		
		
		
		do {
			channel.sendTyping();
			//channel.sendMessage("How many people are in your party.").queue();
			channel.sendMessage(comnand).queue();
			
			
			if (comnand == "!2") {
				lcv = false; 
				
			}
		}while(lcv);
		
		
	}

}
