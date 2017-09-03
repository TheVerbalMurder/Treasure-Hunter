public class EventListener {

	@EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
	public void dissallowRenamingToHurr(EventFactionsNameChange event)
	{
		// If the new faction name is "Hurr" ...
		if ( ! "hurr".equalsIgnoreCase(event.getNewName())) return;
		
		// ... then cancel the event ...
		event.setCancelled(true);
		
		// ... and inform the command sender.
		event.getSender().sendMessage("You may not rename your faction to hurr!");
	}
}
