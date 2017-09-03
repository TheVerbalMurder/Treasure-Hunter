
public class MPlayer {
	// Import some classes
	import java.util.UUID;
	import org.bukkit.command.CommandSender;
	import org.bukkit.entity.Player;
	import com.massivecraft.factions.entity.MPlayer;
	 
	// Create a few common types of player identifiers.
	String uuidString = "3defeec7-b3b1-48d9-82bb-2a8903df24e3";
	UUID uuid = UUID.fromString(uuidString);
	CommandSender commandSender = Bukkit.getConsoleSender();
	Player player = event.getPlayer();
	String name = "Cayorion";
	 
	// The faction player data class is called "MPlayer".
	MPlayer mplayer;
	 
	// Fetching the data is this simple.
	mplayer = MPlayer.get(uuidString);
	mplayer = MPlayer.get(uuid);
	mplayer = MPlayer.get(commandSender);
	mplayer = MPlayer.get(player);
	// mplayer = MPlayer.get(name); // Not allowed! Do it this way instead:
	mplayer = MPlayer.get(IdUtil.getId(name));

}
