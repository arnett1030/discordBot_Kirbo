import net.dv8tion.jda.api.*;

public class Main {
	public static void main(String[] arguments) throws Exception
	{
		try {
			
	    JDA api = new JDABuilder("").build(); //GET RID OF THE KEY WHEN U PUSH
	    api.addEventListener(new CommandEventlistener());
	    
	    System.out.println("System Has Started");
	    
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
