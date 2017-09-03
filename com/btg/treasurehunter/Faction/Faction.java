public class Faction {

	// Import some classes
	import org.bukkit.Bukkit;
	import org.bukkit.Location;
	import com.massivecraft.factions.cmd.arg.ARFaction;
	import com.massivecraft.factions.entity.BoardColl;
	import com.massivecraft.factions.entity.Faction;
	import com.massivecraft.factions.entity.FactionColl;
	import com.massivecraft.factions.entity.MPlayer;
	import com.massivecraft.massivecore.ps.PS;
	 
	...
	 
	// The faction data class is simply called "Faction".
	Faction faction = null;
	 
	// If you have an MPlayer you can get the Faction it belongs to.
	// NOTE: If the player has no faction Wilderness/None will be returned.
	MPlayer mplayer = null;
	faction = mplayer.getFaction();
	 
	// The Wilderness (None), Safezone and Warzone can be retrieved like this:
	faction = FactionColl.get().getNone();
	faction = FactionColl.get().getSafezone();
	faction = FactionColl.get().getWarzone();
	 
	// What faction owns the land at a certain location?
	Location location = new Location(Bukkit.getWorld("derp"), 1337, 1337, 1337);
	faction = BoardColl.get().getFactionAt(PS.valueOf(location));
	 
	// Get a Faction by name
	faction = FactionColl.get().getByName("factionName");
	 
	// Get a Faction by id
	String factionId = "3defeec7-b3b1-48d9-82bb-2a8903df24e3";
	if (FactionColl.get().containsId(factionId))
	{
		faction = FactionColl.get().get(factionId);
	}
	 
	// Get a Faction by either name or id.
	faction = ARFaction.get().read("name or id").getResult();
	 
	// Iterating over all Factions
	for (Faction faction : FactionColl.get().getAll())
	{
		// Do something fancy here
	}
	
}
