package Bot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;


public class App 
{
    public static void main( String[] args ) throws LoginException {
    	JDABuilder builder = JDABuilder.createDefault("ODIyNTcyNTc1OTEzMjc5NTU0.YFUOaA.PnZkhioRqz5V_Q_cUv7mH6Gbs5U");
		// Disable parts of the cache
	    //builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
	    // Enable the bulk delete event
	    //builder.setBulkDeleteSplittingEnabled(false);
	    // Disable compression (not recommended)
	    //builder.setCompression(Compression.NONE);
	    // Set activity (like "playing Something")
	   builder.setActivity(Activity.watching("CS 321 Vids"));
	   Receiver receiver = new Receiver();
	   builder.addEventListeners(receiver);
	   builder.build();
		
    }
}