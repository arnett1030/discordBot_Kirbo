import net.dv8tion.jda.api.*;

public class Main {
	public static void main(String[] arguments) throws Exception
	{
		try {
			
	    JDA api = new JDABuilder("Njc3NjY1MjM2ODQwNDgwNzY5.XkXi_Q.Brp1RIJtQ62p7T3_a5nxaYwA1eM").build();
	    api.addEventListener(new CommandEventlistener());
	    
	    System.out.println("System Has Started");
	    
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
